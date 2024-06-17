
package Ejercicio6;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class AlcanciaDigital {

    private double saldo;
    private List<Transaccion> transacciones;

    public AlcanciaDigital() {
        saldo = 0;
        transacciones = new ArrayList<>();
    }

    public void ingresarDinero(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            transacciones.add(new Transaccion("ingreso", cantidad));
            System.out.println("Ingresaste $" + cantidad + " a la alcancía.");
        }
    }

    public void sacarDinero(double cantidad) {
        if (cantidad > 0 && saldo >= cantidad) {
            saldo -= cantidad;
            transacciones.add(new Transaccion("retiro", cantidad));
            System.out.println("Se retiró $" + cantidad + " de la alcancía.");
        } else {
            System.out.println("No puedes retirar esa cantidad. Saldo insuficiente.");
        }
    }

    public double consultarSaldo() {
        return saldo;
    }

    public List<Transaccion> consultarTransacciones() {
        return transacciones;
    }
}
