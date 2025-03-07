/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poopersona;

/**
 *
 * @author PC
 */
public class Deportista {
    
}
package deportista;

public class Deportistas extends Persona {
    private String deporte;
    private int nivelCompetencia; // 1: Aficionado, 2: Semiprofesional, 3: Profesional

    public Deportistas(String nombre, int edad, String deporte, int nivelCompetencia) {
        super(nombre = deporte;
        this.nivelCompetencia = nivelCompetencia;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public int getNivelCompetencia() {
        return nivelCompetencia;
    }

    public void setNivelCompetencia(int nivelCompetencia) {
        this.nivelCompetencia = nivelCompetencia;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Deporte: " + deporte);
        System.out.println("Nivel de Competencia: " + nivelCompetencia);
}
}
