package Ejercicio2;

import java.util.ArrayList;

/**
 *
 * 
 * @author USR-79M2
 */
public class Estudiantes {

    /*
El departamento escolar de la facultad de ingeniería necesita
obtener un reporte global de los promedios de sus estudiantesy que muestre el promedio de
cada uno, nombres, apellidos,
carrera y semestre. Se debe imprimir el promedio global y cada uno de los datos de los
estudiantes.
     */

// Declaracion de atributos
        private String nombres;
        private String apellidos;
        private String carrera;
        private String semestre;
        private int canEstudiante;
        private double promedio;
        private double promedioGlobal;

        // Contructor
        public Estudiantes(String nombres, String apellidos, String carrera, String semestre,
                int canEstudiante, double promedio, double promedioGlobal) {

            this.nombres = nombres;
            this.apellidos = apellidos;
            this.carrera = carrera;
            this.semestre = semestre;
            this.canEstudiante = canEstudiante;
            this.promedio = promedio;
            this.promedioGlobal = promedioGlobal;
        }

        // Metodos get y set (omitiendo para brevedad)
        public String getNombres() {
            return nombres;
        }

        public void setNombres(String nombres) {
            this.nombres = nombres;
        }

        public String getApellidos() {
            return apellidos;
        }

        public void setApellidos(String apellidos) {
            this.apellidos = apellidos;
        }

        public String getCarrera() {
            return carrera;
        }

        public void setCarrera(String carrera) {
            this.carrera = carrera;
        }

        public String getSemestre() {
            return semestre;
        }

        public void setSemestre(String semestre) {
            this.semestre = semestre;
        }

        public int getCanEstudiante() {
            return canEstudiante;
        }

        public void setCanEstudiante(int canEstudiante) {
            this.canEstudiante = canEstudiante;
        }

        public double getPromedio() {
            return promedio;
        }

        public void setPromedio(double promedio) {
            this.promedio = promedio;
        }

        public double getPromedioGlobal() {
            return promedioGlobal;
        }

        public void setPromedioGlobal(double promedioGlobal) {
            this.promedioGlobal = promedioGlobal;
        }
// Método para calcular el promedio

        public double promedio() {
            return this.promedio;
        }
// Método para calcular el promedio global de todos los estudiantes

        public static double calcularPromedioGlobal(ArrayList<Estudiantes> estudiantes) {
            double sumaPromedios = 0;
            int totalEstudiantes = estudiantes.size();
            for (Estudiantes estudiante : estudiantes) {
                sumaPromedios += estudiante.getPromedio();
            }
            return sumaPromedios / totalEstudiantes;
        }
// Imprimir los datos del estudiante

        public void imprimirDatos() {
            System.out.println("Nombre del estudiante: " + this.nombres + " " + this.apellidos);
            System.out.println("Carrera: " + this.carrera);
            System.out.println("Semestre: " + this.semestre);
            System.out.println("Promedio del estudiante: " + this.promedio);
            System.out.println("Promedio Global: " + this.promedioGlobal);
        }
}
