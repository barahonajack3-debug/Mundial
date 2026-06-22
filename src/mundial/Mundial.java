/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mundial;

/**
 *
 * @author USER
 */
public class Mundial {
    
private String nombre;
private int año;
private String Pais;
private String Selecciones;
private String Partidos;


//metodo get
public String getNombre(){
    return this.nombre;
}
public int getAño(){
    return this.año;
}
public String getPais(){
    return this.Pais;
}
public String getSelecciones(){
    return this.Selecciones;
}
public String getPartidos(){
    return this.Partidos;
}
public Mundial(String nombre,int año,String Pais,String Selecciones,String Partidos){
    this.nombre=nombre;
    this.año=año;
    this.Pais=Pais;
    this.Selecciones=Selecciones;
    this.Partidos=Partidos;
}
public String toString(){
    return "nombre"+ this.nombre +"\nAño"+ this.año+ "\nPais"+ this.Pais+ "\nSelecciones"+ this.Selecciones+ "\nPartidos"+ Partidos;
}




}


