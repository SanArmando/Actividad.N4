/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * 
 * @author USR-79M2
 */
public class Ejercicio4 {

    def calcular_gastos_administrativos(mano_obra, precio_repuestos) :
    return 0.15 * (mano_obra + precio_repuestos)

def imprimir_cotizacion(datos_vehiculo, mano_obra, precio_repuestos, gastos_administrativos, total):
    print("\n--- Cotización de Reparación ---")
    print(f"Marca: {datos_vehiculo['marca']}")
    print(f"Modelo: {datos_vehiculo['modelo']}")
    print(f"Color: {datos_vehiculo['color']}")
    print(f"Año: {datos_vehiculo['año']}")
    print(f"Motivo de reparación: {datos_vehiculo['motivo']}")
    print("\n--- Detalle de la Cotización ---")
    print(f"Mano de Obra: {mano_obra:.2f}")
    print(f"Precio de Repuestos: {precio_repuestos:.2f}")
    print(f"Gastos Administrativos (15%): {gastos_administrativos:.2f}")
    print(f"Total a Pagar: {total:.2f}")
    print("-------------------------------\n")

def main():
    # Solicitar datos del vehículo
    marca = input("Ingrese la marca del vehículo: ")
    modelo = input("Ingrese el modelo del vehículo: ")
    color = input("Ingrese el color del vehículo: ")
    año = input("Ingrese el año del vehículo: ")
    motivo = input("Ingrese el motivo de reparación: ")

    datos_vehiculo = {
        "marca": marca,
        "modelo": modelo,
        "color": color,
        "año": año,
        "motivo": motivo
    }

    # Solicitar costos
    try:
        mano_obra  = float

    (input(

    "Ingrese el costo de la mano de obra: "))
        precio_repuestos = float (input

("Ingrese el precio total de los repuestos: "))
    except ValueError:
        print("Por favor, ingrese valores numéricos válidos.")
        return

    # Calcular gastos administrativos y total
    gastos_administrativos = calcular_gastos_administrativos(mano_obra, precio_repuestos)
    total = mano_obra + precio_repuestos + gastos_administrativos

    # Imprimir cotización
    imprimir_cotizacion(datos_vehiculo, mano_obra, precio_repuestos, gastos_administrativos, total)

if __name__ == "__main__":
    main() 
    
}
