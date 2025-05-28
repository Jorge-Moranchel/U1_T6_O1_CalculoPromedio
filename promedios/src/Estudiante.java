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

    // Método para verificar si el estudiante está aprobado
    public boolean aprobado() {
        return calcularPromedio() >= 70;
    }

    // Getter y setter para nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter y setter para matrícula
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // Getter para una nota específica
    public double getNota(int i) {
        if (i >= 0 && i < promedio.length) {
            return promedio[i];
        }
        return 0; // Retorna 0 si el índice está fuera de rango
    }

    // Setter para una nota específica
    public void setNota(int i, double n) {
        if (i >= 0 && i < promedio.length) {
            promedio[i] = n;
        }
    }
}