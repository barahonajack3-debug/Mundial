/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jugadores;
import java.time.LocalDate;
import personas.Persona;
/**
 *
 * @author Dario R
 */
public abstract class Jugador extends Persona {
    private int numero;
    private String posicion;
    
    public int getNumero() {
        return numero;
    }
    
    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString(String Nombre,LocalDate FechaNacimiento, String Nacionalidad ) {
    return "Nombre: " + this.Nombre + 
           "\nFechaNacimiento: " + this.FechaNacimiento + 
           "\nNacionalidad: " + this.Nacionalidad + 
           "\nPosicion: "+ posicion + 
           "\nNumero de Dorsal: "+ numero;
    }
}
