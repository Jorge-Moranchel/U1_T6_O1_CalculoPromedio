import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner para leer datos del usuario
        Estudiante[] estudiantes = new Estudiante[5];

        // Ingreso de datos para 5 estudiantes
        for (int i = 0; i < estudiantes.length; i++) {
            estudiantes[i] = new Estudiante();

            System.out.println("Estudiante " + (i + 1));

            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            estudiantes[i].setNombre(nombre);

            System.out.print("Matrícula: ");
            String matricula = scanner.nextLine();
            estudiantes[i].setMatricula(matricula);

            // Ingreso de 5 notas
            for (int j = 0; j < 5; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                double nota = scanner.nextDouble();
                estudiantes[i].setNota(j, nota);
            }

            scanner.nextLine(); // Limpiar buffer
            System.out.println();
        }

        // Mostrar resultados
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println("Nombre: " + estudiantes[i].getNombre());
            System.out.println("Promedio: " + estudiantes[i].calcularPromedio());
            System.out.println("¿Aprobado?: " + (estudiantes[i].aprobado() ? "Sí" : "No"));
            System.out.println("-----------------------------------");
        }

        scanner.close(); // Cerrar el scanner
    }
}
