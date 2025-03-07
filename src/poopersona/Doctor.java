/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poopersona;

/**
 *
 * @author PC
 */
// Clase Doctor que hereda de Persona
public class Doctor extends Persona {
    // Atributo específico de la clase Doctor
    private String especialidad;

    // Constructor de la clase Doctor
    public Doctor(String nombre, int edad, String direccion, String especialidad) {
        super(nombre, edad, direccion); // Llamada al constructor de la superclase (Persona)
        this.especialidad = especialidad; // Inicializa la especialidad del doctor
    }

    // Getter y Setter para especialidad
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    // Implementación del método abstracto mostrarInformacion()
    @Override
    public void mostrarInformacion() {
        // Imprime la información del doctor incluyendo su especialidad
        System.out.println("Doctor: " + getNombre() + ", Edad: " + getEdad() + ", Dirección: " + getDireccion() + ", Especialidad: " + especialidad);
    }
}
