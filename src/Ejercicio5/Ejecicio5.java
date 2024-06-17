/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change
this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio5;

import java.util.Scanner;

/**
 * Calcular el valor a pagar de un cliente por su compra, se desea saber los
 * productos que ha comprado: precio, cantidad, descripción. También el total a
 * pagar y calculo de impuestos, adicional se debe tener el nombre, apellidos y
 * documento del cliente.
 */
public class Ejecicio5 {

    /**
     */
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Juan", "Perez", "123456789");
// Crear productos
        Producto producto1 = new Producto("Camisa", 25.99, 2);
        Producto producto2 = new Producto("Pantalón", 39.99, 1);
        Producto producto3 = new Producto("Zapatos", 49.99, 1);
// Calcular total a pagar
        double subtotal = (producto1.getPrecio() * producto1.getCantidad())
                + (producto2.getPrecio() * producto2.getCantidad())
                + (producto3.getPrecio() * producto3.getCantidad());
        double impuestos = subtotal * 0.15; // 15% de impuestos
        double total = subtotal + impuestos;
// Mostrar información de la compra
        System.out.println("Cliente: " + cliente.getNombre() + " " + cliente.getApellidos());
        System.out.println("Documento: " + cliente.getDocumento());
        System.out.println("Productos comprados:");
        System.out.println("- " + producto1.getDescripcion() + ": $" + producto1.getPrecio() + " x "
                + producto1.getCantidad());
        System.out.println("- " + producto2.getDescripcion() + ": $" + producto2.getPrecio() + " x "
                + producto2.getCantidad());
        System.out.println("- " + producto3.getDescripcion() + ": $" + producto3.getPrecio() + " x "
                + producto3.getCantidad());
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Impuestos: $" + impuestos);
        System.out.println("Total a pagar: $" + total);
    }
}
