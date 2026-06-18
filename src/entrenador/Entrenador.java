/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entrenador;

import java.time.LocalDate;
import personas.Persona;

/**
 *
 * @author Usuario
 */
public class Entrenador extends Persona{
    private int añosExperiencia;

    public Entrenador(String Nombre, LocalDate FechaNacimiento, String Nacionalidad) {
        super(Nombre, FechaNacimiento, Nacionalidad);
    }
    
    public int getAñosExperiencia(){
    return añosExperiencia;
}

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }
    public Entrenador (String Nombre, LocalDate FechaNacimiento, String Nacionalidad,int añosExperiencia){
        this.Nombre=Nombre;
        this.FechaNacimiento=FechaNacimiento;
        this.Nacionalidad=Nacionalidad;
        this.añosExperiencia=añosExperiencia;
    }
    
}
