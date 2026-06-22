/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package partidos;
import abitros.Aribitro;
import java.time.LocalDate;
import java.time.LocalTime;
import selecciones.Seleccion;
/**
 *
 * @author USER
 */
public class Partido {
    //Atributos..
    private Seleccion SeleccionPartido; //cambiar a clase seleccion 
    private Seleccion SeleccionVisitante; //cambiar a clase sellecion
    private String Estadio;
    private LocalDate Fecha;
    private LocalTime Hora;
    private Aribitro Arbitro;//Cambiar clase a arbitro arbitros []
    private String Resultados;//agregar clase resultado = new resultado 
    
    //Metodos get...
    public Seleccion getSeleccionPartido() {
        return SeleccionPartido;
    }
    public Seleccion getSeleccionVisitante() {
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
    public Aribitro getArbrito() {
        return Arbitro;
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
    public void setArbrito(Aribitro Arbrito) {
        this.Arbitro = Arbitro;
    }
    public void setResultado(String Resultado) {
        this.Resultados = Resultado;
    }
    
    //Metodos constructor...
    public Partido(Seleccion SeleccionPartido, Seleccion SeleccionVisitante, String Estadio, LocalDate Fecha, LocalTime Hora, Aribitro Arbitro) {
        this.SeleccionPartido = SeleccionPartido;
        this.SeleccionVisitante = SeleccionVisitante;
        this.Estadio = Estadio;
        this.Fecha = Fecha;
        this.Hora = Hora;
        this.Arbitro = Arbitro;
    }
    
    //Metodo ToString...
    public String toString() {
        return "SeleccionPartido:" + SeleccionPartido + "\nSeleccionVisitante:" + SeleccionVisitante 
                + "\nEstadio:" + Estadio + "\nFecha:" + Fecha + "\nHora:" + Hora 
                + "\nArbrito:" + Arbitro + "\nResultado:" + (Resultados==null?"No jugado":Resultados);
    }
}