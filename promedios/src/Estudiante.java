public class Estudiante {
    private String nombre;
    private String matricula;
    private double[] promedio = new double[5];

    public double calcularPromedio() {
        double suma = 0;
        for (int i = 0; i < promedio.length; i++) {
            suma += promedio[i];
        }
        return suma / promedio.length;
    }

    public boolean aprobado() {
        return calcularPromedio() >= 70;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getNota(int i) {
        if (i >= 0 && i < promedio.length) {
            return promedio[i];
        }
        return 0;
    }

    public void setNota(int i, double n) {
        if (i >= 0 && i < promedio.length) {
            promedio[i] = n;
        }
    }
}
