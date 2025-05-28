public class Main {
    public static void main(String[] args) {
        // Crear un arreglo de 5 estudiantes
        Estudiante[] estudiantes = new Estudiante[5];

        // Asignar nombre, matrícula y notas a cada estudiante
        for (int i = 0; i < estudiantes.length; i++) {
            estudiantes[i] = new Estudiante(); // Instanciar estudiante
            estudiantes[i].setNombre("Estudiante " + (i + 1)); // Asignar nombre
            estudiantes[i].setMatricula("MAT" + (i + 100)); // Asignar matrícula

            // Asignar 5 notas aleatorias entre 60 y 100
            for (int j = 0; j < 5; j++) {
                estudiantes[i].setNota(j, 60 + Math.random() * 40);
            }
        }

        // Mostrar los resultados de cada estudiante
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println("Nombre: " + estudiantes[i].getNombre());
            System.out.println("Promedio: " + estudiantes[i].calcularPromedio());
            System.out.println("¿Aprobado?: " + (estudiantes[i].aprobado() ? "Sí" : "No"));
            System.out.println("-----------------------------------");
        }
    }
}
