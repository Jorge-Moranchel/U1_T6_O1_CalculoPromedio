public class Main {
    public static void main(String[] args) {
        
        //Creamos el arreglo de 5 estudiantes
        Estudiante[] estudiantes = new Estudiantes[5];

        //Asignar el nombre la matricula y notas a cada estudiantes
        //Aunque se podrian asignar desde aqui bueno del programa xd

        for (int i = 0; i < estudiantes.lenght; i++) {
            estudiantes[i] = new Estudiante(); //Instanciar estudiantes
            estudiantes[i].setNombre("Estudiante " + (i + 1)); //Asignamos nombre
            estudiantes[i].setMatricula("Mat " + (i + 100)); //Asignamos la matricula

            //Asignar 5 notas aleatorias entre el 60 y 100
            for (int j = 0; j < 5; j++) {
                estudiantes[i].setNota(j, 60 + Math.random() * 40);
            }
        }
    }
}