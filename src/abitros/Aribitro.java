/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abitros;
import java.time.LocalDate;
import personas.Persona;
/**
 *
 * @author Dario R
 */
public class Aribitro extends Persona {
    private String categoria;

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    

    public Aribitro(String categoria, String Nombre, LocalDate FechaNacimiento, String Nacionalidad) {
        super(Nombre, FechaNacimiento, Nacionalidad);
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.getNombre() + 
           "\nFechaNacimiento: " + this.getFechaNacimiento() + 
           "\nNacionalidad: " + this.getNacionalidad() + 
           "\nCategoria: "+this.categoria;
    }    
}
