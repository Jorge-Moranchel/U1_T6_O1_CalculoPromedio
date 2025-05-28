import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear cinco objetos Estudiantes creo que asi esta bien bueno asi le entendi profe
        Estudiante estudiante1 = new Estudiante();
        Estudiante estudiante2 = new Estudiante();
        Estudiante estudiante3 = new Estudiante();
        Estudiante estudiante4 = new Estudiante();
        Estudiante estudiante5 = new Estudiante();

        // Llenar los datos de los estudiantes a manita
        llenarDatosEstudiante(scanner, estudiante1, "Estudiante 1");
        llenarDatosEstudiante(scanner, estudiante2, "Estudiante 2");
        llenarDatosEstudiante(scanner, estudiante3, "Estudiante 3");
        llenarDatosEstudiante(scanner, estudiante4, "Estudiante 4");
        llenarDatosEstudiante(scanner, estudiante5, "Estudiante 5");

        // Mostrar resultados
        mostrarResultados(estudiante1);
        mostrarResultados(estudiante2);
        mostrarResultados(estudiante3);
        mostrarResultados(estudiante4);
        mostrarResultados(estudiante5);

        scanner.close();
    }

    // Método para pedir datos a un estudiante o usuario que los quiera hacerlo
    public static void llenarDatosEstudiante(Scanner scanner, Estudiante estudiante, String etiqueta) {
        System.out.println(etiqueta);

        System.out.print("Nombre: ");
        estudiante.setNombre(scanner.nextLine());

        System.out.print("Matrícula: ");
        estudiante.setMatricula(scanner.nextLine());

        for (int i = 0; i < 5; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            double nota = scanner.nextDouble();
            estudiante.setNota(i, nota);
        }

        scanner.nextLine(); //Esto es importante para limpiar el buffer xd
        System.out.println();
    }

    // Método para mostrar resultados y lo cambie creo que esta bien asi
    public static void mostrarResultados(Estudiante estudiante) {
        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Promedio: " + estudiante.calcularPromedio());

        if (estudiante.aprobado()) {
            System.out.println("¿Aprobado?: Sí");
        } else {
            System.out.println("¿Aprobado?: No");
        }

        System.out.println("-----------------------------------");
    }
}