public class Main {
    public static void main(String[] args) {
        
        //Creamos el arreglo de 5 estudiantes
        Estudiante[] estudiantes = new Estudiantes[5];

        //Asignar el nmombre la matricula y notas a cada estudiantes
        //Aunque se podrian asignar desde aqui bueno del programa xd

        for (int i = 0; i < estudiantes.lenght; i++) {
            estudiantes[i] = new Estudiante(); //Instanciar estudiantes
            estudiantes[i].setNombre("Estudiante " + (i + 1)); //Asignamos nombre
            estudiantes[i].setMatricula("Mat " + (i + 100)); //Asignamos la matricula
            
        }
    }
}