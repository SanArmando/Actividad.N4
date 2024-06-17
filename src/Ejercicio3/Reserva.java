/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author USR-79M2
 */
public class Reserva {

    def main()

    :
    hotel = Hotel()
    while True:
        mostrar_menu()
        try:
            opcion = int (input

    ("Seleccione una opción: "))
        except ValueError:
            print("Por favor, ingrese una opción válida.")
            continue

        if opcion == 1:
            numero = input("Ingrese el número de la habitación: ")
            tipo = input("Ingrese el tipo de habitación (sencilla, doble, suite, etc.): ")
            try:
                precio = float (input

("Ingrese el precio de la habitación: "))
                hotel.agregar_habitacion(numero, tipo, precio)
            except ValueError:
                print("Por favor, ingrese un precio válido.")
        elif opcion == 2:
            hotel.listar_habitaciones()
        elif opcion == 3:
            nombre = input("Ingrese el nombre del usuario: ")
            apellido = input("Ingrese el apellido del usuario: ")
            dni = input("Ingrese el DNI del usuario: ")
            hotel.agregar_usuario(nombre, apellido, dni)
        elif opcion == 4:
            hotel.listar_usuarios()
        elif opcion == 5:
            dni_usuario = input("Ingrese el DNI del usuario: ")
            numero_habitacion = input("Ingrese el número de la habitación: ")
            hotel.crear_reserva(dni_usuario, numero_habitacion)
        elif opcion == 6:
            print("Saliendo del sistema de gestión de hotel. ¡Adiós!")
            break
        else:
            print("Por favor, seleccione una opción válida.")

if __name__ == "__main__":
    main()
    
}
