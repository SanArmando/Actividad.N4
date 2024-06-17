/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author USR-79M2
 */
public class Ejercicio3 {

    import random

    # Definición de la clase Hotel para gestionar habitaciones, usuarios y reservas

    class Hotel 

        :
    def __init__(self):
        self.habitaciones = []
        self.usuarios = []
        self.reservas = []

    def agregar_habitacion(self, numero, tipo, precio):
        habitacion = {"numero": numero , "tipo": tipo , "precio": precio
    }

    self.habitaciones.append (habitacion) print(f"Habitación {numero} agregada exitosamente.")

    def listar_habitaciones(self):
        if not self.habitaciones:
            print("No hay habitaciones disponibles.")
        else:
            for hab in self.habitaciones:
                print(f"Número: {hab['numero']}, Tipo: {hab['tipo']}, Precio: {hab['precio']}")

    def agregar_usuario(self, nombre, apellido, dni):
        usuario = {"nombre": nombre, "apellido": apellido, "dni": dni
    }

    self.usuarios.append (usuario) print(f"Usuario {nombre} {apellido} agregado exitosamente.")

    def listar_usuarios(self):
        if not self.usuarios:
            print("No hay usuarios registrados.")
        else:
            for usr in self.usuarios:
                print(f"Nombre: {usr['nombre']} {usr['apellido']}, DNI: {usr['dni']}")

    def crear_reserva(self, dni_usuario, numero_habitacion):
        usuario = next((usr for usr in self.usuarios if usr["dni"] == dni_usuario), None)
        habitacion = next((hab for hab in self.habitaciones if hab["numero"] == numero_habitacion), None)

        if usuario and habitacion:
            reserva = {"usuario": usuario, "habitacion": habitacion
    }

    self.reservas.append (reserva)

self.imprimir_ticket(reserva)
        else:
            print("Usuario o habitación no encontrados.")

    def imprimir_ticket(self, reserva):
        usuario = reserva["usuario"]
        habitacion = reserva["habitacion"]
        ticket_id = random.randint(1000, 9999)
        print("\n--- Ticket de Reserva ---")
        print(f"ID de Reserva: {ticket_id}")
        print(f"Nombre: {usuario['nombre']} {usuario['apellido']}")
        print(f"DNI: {usuario['dni']}")
        print(f"Habitación: {habitacion['numero']}")
        print(f"Tipo: {habitacion['tipo']}")
        print(f"Precio: {habitacion['precio']}")
        print("------------------------\n")
    
}
