import java.util.Scanner;

public class NotasAlumnos {
    public static void main(String[] args) {

        double[] matematicas, historia, lenguaje;

        matematicas = new double[7];
        historia = new double[7];
        lenguaje = new double[7];

        double notasMatematicas = 0, notasHistoria = 0, notasLenguaje = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese las notas de Matematicas para los 7 alumnos");

        for (int i = 0; i < matematicas.length; i++) {
            matematicas[i] =   scanner.nextDouble();
        }

        System.out.println("ingrese las notas de Historia para los 7 alumnos");

        for (int i = 0; i < historia.length; i++) {
            historia[i] =   scanner.nextDouble();
        }

        System.out.println("ingrese las notas de Lenguaje para los 7 alumnos");

        for (int i = 0; i < lenguaje.length; i++) {
            lenguaje[i] =   scanner.nextDouble();
        }

        for (int i = 0; i < 7; i++) {
            notasMatematicas += matematicas[i];
            notasHistoria += historia[i];
            notasLenguaje += lenguaje[i];
        }

        double promedioMatematicas = (notasMatematicas / matematicas.length);
        double promedioHistoria = (notasHistoria / historia.length);
        double promedioLenguaje = (notasLenguaje / lenguaje.length);


        System.out.println("Promedio clase de Matematicas " + promedioMatematicas);
        System.out.println("Promedio clase de Historia " + promedioHistoria);
        System.out.println("Promedio clase de Lenguaje " + promedioLenguaje);

        System.out.println( "Promedio total del curso = " + (promedioMatematicas + promedioHistoria + promedioLenguaje)/3);

        System.out.println("Indique el Id del alumno para obtener su promedio");
        System.out.println("del 0 al 6");
        int indiceAlumno = scanner.nextInt();

        System.out.println("Promedio de alumno " + indiceAlumno);
        System.out.println( (matematicas[indiceAlumno] + historia[indiceAlumno] + lenguaje[indiceAlumno] )/3);






    }
}
