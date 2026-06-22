/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package selecciones;

import jugadores.Jugador;




public class Seleccion  {

    private String nombre;
    private String grupo;
    private String entrenador;
    private Jugador[] jugadores;
    private int cantidadJ;

    public String getNombre() {
        return nombre;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(String entrenador) {
        this.entrenador = entrenador;
    }

    public Jugador[] getJugadores() {
        return jugadores;
    }
    
     public Seleccion(String nombre, String grupo) {
       this.nombre = nombre;
        this.grupo = grupo;
        this.jugadores = new Jugador[23];
        this.cantidadJ = 0;
        
    }
     public void agregarJugador(Jugador jugador) {
    if (cantidadJ >= jugadores.length) {
            System.out.println("La selección ya tiene 23 jugadores.");
            return;}
    if (existeCamisa(jugador.getNumero())) {
            System.out.println("Ya existe un jugador con la camiseta #" + jugador.getNumero());
            return;} 
     jugadores[cantidadJ] = jugador;
        cantidadJ++;
        System.out.println(jugador.getNombre() + " agregado correctamente.");
        
        
    }
    public void eliminarJugador(Jugador jugador) {
        for (int i = 0; i < cantidadJ; i++) {
            if (jugadores[i].equals(jugador)) {
                // Desplaza los elementos hacia la izquierda
                for (int j = i; j < cantidadJ - 1; j++) {
                    jugadores[j] = jugadores[j + 1];
                }
                jugadores[cantidadJ - 1] = null;
                cantidadJ--;
                System.out.println(jugador.getNombre() + " eliminado correctamente.");
                return;
            }
        }
        System.out.println("Jugador no encontrado.");
    }
    
     public Jugador buscarPorNombre(String nombre) {
        for (int i = 0; i < cantidadJ; i++) {
            if (jugadores[i].getNombre().equalsIgnoreCase(nombre)) {
                return jugadores[i];
            }
        }
        System.out.println("No se encontró ningún jugador con el nombre: " + nombre);
        return null;
    }
     
      public Jugador buscarPorCamiseta(int numero) {
        for (int i = 0; i < cantidadJ; i++) {
            if (jugadores[i].getNumero() == numero) {
                return jugadores[i];
            }
        }
        System.out.println("No se encontró ningún jugador con la camiseta #" + numero);
        return null;
    }

      public int contarJugadores() {
        return cantidadJ;
    }
      
        public boolean existeCamisa(int numero) {
        for (int i = 0; i < cantidadJ; i++) {
            if (jugadores[i].getNumero() == numero) {
                return true;
            }
        }
        return false;
    }
        
        @Override
public String toString() {
    String resultado = "Selección: " + nombre +
                       "\nGrupo: " + grupo +
                       "\nEntrenador: " + entrenador +
                       "\nJugadores registrados: " + cantidadJ +
                       "\n---------------------------------\n";
    
    for (int i = 0; i < cantidadJ; i++) {
        resultado += (i + 1) + ". " + jugadores[i].getNombre() + 
                     " | Camiseta #" + jugadores[i].getNumero() + 
                     " | Posicion: " + jugadores[i].getPosicion() + "\n";
    }
    
    return resultado;
}
}





