/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package partidos;
import abitros.Aribitro;
import java.time.LocalDate;
import java.time.LocalTime;
import resultado.Resultados;
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
    private int CantidaArbitros;
    private Aribitro[] Arbitros;//Cambiar clase a arbitro arbitros []
    private Resultados Resultado;//agregar clase resultado = new resultado 
    
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
    public Aribitro[] getArbrito() {
        return Arbitros;
    }
    public Resultados getResultado() {
        return Resultado;
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
    public void setResultado(Resultados Resultado) {
        this.Resultado = Resultado;
    }
    
    //Metodos constructor...
    public Partido(Seleccion SeleccionPartido, Seleccion SeleccionVisitante, String Estadio, 
            LocalDate Fecha, LocalTime Hora, Aribitro[] Arbitro,Resultados Resultado,int CabtidadAtributos) {
        this.SeleccionPartido = SeleccionPartido;
        this.SeleccionVisitante = SeleccionVisitante;
        this.Estadio = Estadio;
        this.Fecha = Fecha;
        this.Hora = Hora;
        this.Arbitros = new Aribitro[10];
        this.Resultado = Resultado;
        this.CantidaArbitros= 0;
    }
    
    //Funcion para agregar arbitros...
    public boolean agregarArbitro(Aribitro Arbitro){
        if (Arbitro==null){
            return false;
        }
        if(buscarArbitro(Arbitro.getNombre())!=null){
            return false;   
        }if(CantidaArbitros>=Arbitros.length){
            return false;
        }
        Arbitros[CantidaArbitros]=Arbitro;
            CantidaArbitros++;
        return true;  
    }
        
        //Funcion para eliminar un arbitro...
        public boolean eliminarArbitro(String nombre) {
        int posicion = -1;
        for (int i = 0; i < CantidaArbitros; i++) {
            if (Arbitros[i].getNombre().equalsIgnoreCase(nombre)) {
                posicion = i;
                break;
            }
        }
        if (posicion == -1) {
            return false;
        }
        for (int i = posicion; i < CantidaArbitros - 1; i++) {
            Arbitros[i] = Arbitros[i + 1];
        }
        Arbitros[CantidaArbitros - 1] = null;
        CantidaArbitros--;
        return true;
    }

    //Funcion para buscar un arbitro por nombre
    public Aribitro buscarArbitro(String nombre) {
        for (int i = 0; i < CantidaArbitros; i++) {
            if (Arbitros[i].getNombre().equalsIgnoreCase(nombre)) {
                return Arbitros[i];
            }
        }
        return null;
    }

    //Funcion para contar la cantidad de arbitros asignados
    public int contarArbitros() {
        return CantidaArbitros;
    }
    //Funcion para verificar si un arbitro ya se encuentra registrado en el partido
    public boolean existeArbitro(String nombre) {
        return buscarArbitro(nombre) != null;
    }

    //Metodo ToString...
    public String toString() {
        return "SeleccionPartido:" + SeleccionPartido + "\nSeleccionVisitante:" + SeleccionVisitante 
                + "\nEstadio:" + Estadio + "\nFecha:" + Fecha + "\nHora:" + Hora 
                + "\nArbrito:" + Arbitros + "\nResultado:" + (Resultado==null?"No jugado":Resultado);
    }
}