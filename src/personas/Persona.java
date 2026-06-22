/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author USER
 */
public class Persona {
    //Atributos

    protected String Nombre;
    protected LocalDate FechaNacimiento;
    protected String Nacionalidad;

    //Metodos get 
    public String getNombre() {
        return Nombre;
    }
    public LocalDate getFechaNacimiento() {
        return FechaNacimiento;
    }
    public String getNacionalidad() {
        return Nacionalidad;
    }
    public int getEdad(){
        return Period.between(FechaNacimiento,LocalDate.now()).getYears();
    }
    //Metodos set 
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    //Metodo constructor
    public Persona(String Nombre, LocalDate FechaNacimiento, String Nacionalidad) {
        this.Nombre = Nombre;
        this.FechaNacimiento = FechaNacimiento;
        this.Nacionalidad = Nacionalidad;
    }
    //Metodo ToString
    public String toString() {
        return "Nombre:" + Nombre + "\nFechaNacimiento:" + FechaNacimiento + "\nNacionalidad:" + Nacionalidad;
    }
}