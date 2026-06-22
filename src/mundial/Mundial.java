/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mundial;

import partidos.Partido;
import selecciones.Seleccion;

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
private Seleccion[] selecciones = new Seleccion[32]; 
private int cantidadS = 0;
private Partido[] partidos = new Partido[64];
private int cantidadP = 0;


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
public void agregarSeleccion(Seleccion seleccion) {
    if (cantidadS >= selecciones.length) {
        System.out.println("Ya se alcanzó el máximo de selecciones.");
        return;
    }
    selecciones[cantidadS] = seleccion;
    cantidadS++;
    System.out.println(seleccion.getNombre() + " agregada correctamente.");
}
public void eliminarSeleccion(String nombreSeleccion) {
    for (int i = 0; i < cantidadS; i++) {
        if (selecciones[i].getNombre().equalsIgnoreCase(nombreSeleccion)) {
            for (int j = i; j < cantidadS - 1; j++) {
                selecciones[j] = selecciones[j + 1];
            }
            selecciones[cantidadS - 1] = null;
            cantidadS--;
            System.out.println(nombreSeleccion + " eliminada correctamente.");
            return;
        }
    }
    System.out.println("Selección no encontrada.");
}
public Seleccion buscarSeleccionPorNombre(String nombreSeleccion) {
    for (int i = 0; i < cantidadS; i++) {
        if (selecciones[i].getNombre().equalsIgnoreCase(nombreSeleccion)) {
            return selecciones[i];
        }
    }
    System.out.println("Selección no encontrada.");
    return null;
}
public int contarSelecciones() {
    return cantidadS;
}
public boolean verificarSeleccionInscrita(String nombreSeleccion) {
    for (int i = 0; i < cantidadS; i++) {
        if (selecciones[i].getNombre().equalsIgnoreCase(nombreSeleccion)) {
            return true;
        }
    }
    return false;
}

public Seleccion[] obtenerSeleccionesPorGrupo(String grupo) {
    int contador = 0;
    for (int i = 0; i < cantidadS; i++) {
        if (selecciones[i].getGrupo().equalsIgnoreCase(grupo)) {
            contador++;
        }
    }
    
    Seleccion[] resultado = new Seleccion[contador];
    int pos = 0;

    for (int i = 0; i < cantidadS; i++) {
        if (selecciones[i].getGrupo().equalsIgnoreCase(grupo)) {
            resultado[pos] = selecciones[i];
            pos++;
        }
    }
    
    return resultado;
}

public void agregarPartido(Partido partido) {
    if (cantidadP >= partidos.length) {
        System.out.println("Ya se alcanzó el máximo de partidos.");
        return;
    }
    partidos[cantidadP] = partido;
    cantidadP++;
    System.out.println("Partido agregado correctamente.");
}
public void eliminarPartido(String nombreLocal, String nombreVisitante) {
    for (int i = 0; i < cantidadP; i++) {
        if (partidos[i].getSeleccionPartido().getNombre().equalsIgnoreCase(nombreLocal)
                && partidos[i].getSeleccionVisitante().getNombre().equalsIgnoreCase(nombreVisitante)) {
            for (int j = i; j < cantidadP - 1; j++) {
                partidos[j] = partidos[j + 1];
            }
            partidos[cantidadP - 1] = null;
            cantidadP--;
            System.out.println("Partido eliminado correctamente.");
            return;
        }
    }
    System.out.println("Partido no encontrado.");
}
public int contarPartidos() {
    return cantidadP;
}
public Partido[] obtenerPartidosPorSeleccion(String nombreSeleccion) {
    int contador = 0;
    for (int i = 0; i < cantidadP; i++) {
        if (partidos[i].getSeleccionPartido().getNombre().equalsIgnoreCase(nombreSeleccion)
                || partidos[i].getSeleccionVisitante().getNombre().equalsIgnoreCase(nombreSeleccion)) {
            contador++;
        }
    }
    Partido[] resultado = new Partido[contador];
    int pos = 0;
    for (int i = 0; i < cantidadP; i++) {
        if (partidos[i].getSeleccionPartido().getNombre().equalsIgnoreCase(nombreSeleccion)
                || partidos[i].getSeleccionVisitante().getNombre().equalsIgnoreCase(nombreSeleccion)) {
            resultado[pos] = partidos[i];
            pos++;
        }
    }
    return resultado;
}
public Partido[] buscarPartidosProgramados(String nombreSeleccion) {

    int contador = 0;
    for (int i = 0; i < cantidadP; i++) {
        boolean participa = partidos[i].getSeleccionPartido().getNombre().equalsIgnoreCase(nombreSeleccion)
                || partidos[i].getSeleccionVisitante().getNombre().equalsIgnoreCase(nombreSeleccion);
        if (participa && partidos[i].getResultado() == null) {
            contador++;
        }
    }
    Partido[] resultado = new Partido[contador];
    int pos = 0;

    for (int i = 0; i < cantidadP; i++) {
        boolean participa = partidos[i].getSeleccionPartido().getNombre().equalsIgnoreCase(nombreSeleccion)
                || partidos[i].getSeleccionVisitante().getNombre().equalsIgnoreCase(nombreSeleccion);
        if (participa && partidos[i].getResultado() == null) {
            resultado[pos] = partidos[i];
            pos++;
        }
    }
    return resultado;
}
} 


