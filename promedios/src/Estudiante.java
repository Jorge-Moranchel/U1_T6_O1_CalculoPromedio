public class Estudiante {
    // Atributos privados
    private String nombre;
    private String matricula;
    private double[] promedio = new double[5]; // Arreglo para guardar 5 notas

    // Método para calcular el promedio de las 5 notas
    public double calcularPromedio() {
        double suma = 0;
        for (int i = 0; i < promedio.length; i++) {
            suma += promedio[i]; // Sumar todas las notas
        }
        return suma / promedio.length; // Promedio
    }
}