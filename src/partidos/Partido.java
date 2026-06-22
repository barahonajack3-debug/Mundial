/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package partidos;
import java.time.LocalDate;
import java.time.LocalTime;
/**
 *
 * @author USER
 */
public class Partido {
    //Atributos..
    private String SeleccionPartido; //cambiar a clase seleccion 
    private String SeleccionVisitante; //cambiar a clase sellecion
    private String Estadio;
    private LocalDate Fecha;
    private LocalTime Hora;
    private String Arbrito;//Cambiar clase a arbitro arbitros []
    private String Resultados;//agregar clase resultado = new resultado 
    
    //Metodos get...
    public String getSeleccionPartido() {
        return SeleccionPartido;
    }
    public String getSeleccionVisitante() {
        return SeleccionVisitante;
    }
    public String getEstadio() {
        return Estadio;
    }
    public LocalDate getFecha() {
        return Fecha;
    }
    public LocalTime getHora() {
        return Hora;
    }
    public String getArbrito() {
        return Arbrito;
    }
    public String getResultado() {
        return Resultados;
    }
    
    //Metodos set...
    public void setEstadio(String Estadio) {
        this.Estadio = Estadio;
    }
    public void setFecha(LocalDate Fecha) {
        this.Fecha = Fecha;
    }
    public void setHora(LocalTime Hora) {
        this.Hora = Hora;
    }
    public void setArbrito(String Arbrito) {
        this.Arbrito = Arbrito;
    }
    public void setResultado(String Resultado) {
        this.Resultados = Resultado;
    }
    
    //Metodos constructor...
    public Partido(String SeleccionPartido, String SeleccionVisitante, String Estadio, LocalDate Fecha, LocalTime Hora, String Arbrito) {
        this.SeleccionPartido = SeleccionPartido;
        this.SeleccionVisitante = SeleccionVisitante;
        this.Estadio = Estadio;
        this.Fecha = Fecha;
        this.Hora = Hora;
        this.Arbrito = Arbrito;
    }
    
    //Metodo ToString...
    public String toString() {
        return "SeleccionPartido:" + SeleccionPartido + "\nSeleccionVisitante:" + SeleccionVisitante 
                + "\nEstadio:" + Estadio + "\nFecha:" + Fecha + "\nHora:" + Hora 
                + "\nArbrito:" + Arbrito + "\nResultado:" + (Resultados==null?"No jugado":Resultados);
    }
}