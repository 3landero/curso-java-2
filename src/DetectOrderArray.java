import java.util.Scanner;

public class DetectOrderArray {
    public static void main(String[] args) {

        int[] numeros = new int[7];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 7 numeros enteros");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }

        boolean ascendente = false;
        boolean descendiente = false;

        for (int i = 0; i < numeros.length -1 ; i++){
            if (numeros[i] > numeros[i+1]){
                descendiente = true;
            }

            if (numeros[i] < numeros[i+1]){
                ascendente = true;
            }
        }

        if (descendiente == true && ascendente== true){
            System.out.println("Los numeros no estan ordenados");
        }

        if (descendiente == false && ascendente == false){
            System.out.println("Los numeros son iguales");
        }

        if (descendiente == true && ascendente == false ){
            System.out.println("Arreglo con orden descendiente");
        }

        if (descendiente ==false && ascendente == true){
            System.out.println("Arreglo con orden ascendente");
        }

    }
}
