
package Ejercicio6;

import java.util.ArrayList;
import java.util.List;

/**
 
 * @author sebas
 */
public class Transaccion {

    private String tipo;
    private double cantidad;

    public Transaccion(String tipo, double cantidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Transacción: " + tipo + ", Cantidad: $" + cantidad;
    }
}
