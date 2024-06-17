/*
El departamento escolar de la facultad de ingeniería necesita
obtener un reporte global de los promedios de sus estudiantes
y que muestre el promedio de cada uno, nombres, apellidos,
carrera y semestre. Se debe imprimir el promedio global y cada
uno de los datos de los estudiantes.
 */
package ejercicio2;

import java.util.ArrayList;

public class Ejercicio2 {

    public static void main(String[] args) {
        // Declaracion de estudiantes

        Estudiantes estudiantes1 = new Estudiantes("Sebastian", "Torres", "Informatica", "segundo", 6, 4.5, 4.0);
        Estudiantes estudiantes2 = new Estudiantes("Alejandro", "Garzon", "Sistemas", "Tercero", 12, 3.2, 4.0);
        Estudiantes estudiantes3 = new Estudiantes("Antonio", "Meza", "Ing_Ambiental", "sexto", 21, 4.0, 4.2);
        Estudiantes estudiantes4 = new Estudiantes("Juan", "Vera", "Sofware", "noveno", 17, 5.0, 4.5);
        Estudiantes estudiantes5 = new Estudiantes("Cristophor", "Perez", "Ing_Civil", "decimo", 11, 4.8, 4.0);

// Agregar los estudiantes a un ArrayList
        ArrayList<Estudiantes> listaEstudiantes = new ArrayList<>();

        listaEstudiantes.add(estudiantes1);
        listaEstudiantes.add(estudiantes2);
        listaEstudiantes.add(estudiantes3);
        listaEstudiantes.add(estudiantes4);
        listaEstudiantes.add(estudiantes5);

// Imprimir los datos de los estudiantes
        for (Estudiantes estudiante : listaEstudiantes) {
            estudiante.imprimirDatos();
        }
// Calcular y mostrar el promedio global

        double promedioGlobal = Estudiantes.calcularPromedioGlobal(listaEstudiantes);
        System.out.println("Promedio Global de los estudiantes: " + promedioGlobal);
    }
}
