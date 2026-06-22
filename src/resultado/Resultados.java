/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resultado;

/**
 *
 * @author USER
 */
public class Resultados {
    private String EquipoGanardor;
    private String EquipoPerdedor;
    private String Resultado;

    public String getEquipoGanardor() {
        return EquipoGanardor;
    }

    public String getEquipoPerdedor() {
        return EquipoPerdedor;
    }

    public String getResultado() {
        return Resultado;
    }

    public Resultados(String EquipoGanardor, String EquipoPerdedor, String Resultado) {
        this.EquipoGanardor = EquipoGanardor;
        this.EquipoPerdedor = EquipoPerdedor;
        this.Resultado = Resultado;
    }

    @Override
    public String toString() {
        return "Resultados" + "\nEquipoGanardor:" + EquipoGanardor + "\nEquipoPerdedor:" + EquipoPerdedor + "\nResultado:" + Resultado;
    }
    
    
}
