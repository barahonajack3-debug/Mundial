/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.time.LocalDate;
/**
 *
 * @author Dario R
 */
public abstract class Persona {
    private String nombre;
    private String nacionalidad;
    private LocalDate fecha;
    
    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Persona(String nombre, String nacionalidad, LocalDate fecha) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", nacionalidad=" + nacionalidad + ", fecha=" + fecha + '}';
    }
   
}
