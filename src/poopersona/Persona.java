/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poopersona;

// Clase abstracta Persona
public abstract class Persona {
    // Atributos encapsulados (privados)
    private String nombreCompleto;
    private int edad;
    private String dni;
    private String telefono;
    private String direccion;
    private String profesion;

    // Constructor
    public Persona(String nombreCompleto, int edad, String dni, String telefono, String direccion, String profesion) {
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.dni = dni;
        this.telefono = telefono;
        this.direccion = direccion;
        this.profesion = profesion;
    }

    // Métodos getters (encapsulamiento)
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public String getDni() {
        return dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getProfesion() {
        return profesion;
    }

    // Métodos setters (encapsulamiento)
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // Método abstracto (abstracción)
    public abstract void mostrarInformacion();

    // Método concreto
    @Override
    public String toString() {
        return "Nombre: " + nombreCompleto + ", Edad: " + edad + ", DNI: " + dni +
               ", Teléfono: " + telefono + ", Dirección: " + direccion + ", Profesión: " + profesion;
    }
}
