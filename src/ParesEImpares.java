import java.util.Scanner;

public class ParesEImpares {
    public static void main(String[] args) {

        int[] numbers = new int[10];

        Scanner scanner = new Scanner(System.in);

        int totalPares = 0;
        int totalImpares = 0;

        System.out.println("Ingrese 10 numeros enteros que se te ocurran");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            if ( numbers[i] % 2 == 0){
                totalPares++;
            }else {
                totalImpares++;
            }
        }

        int[] pares = new int[totalPares];
        int[] impares = new int[totalImpares];

        int indicePar = 0;
        int indiceImpar = 0;

        for (int i = 0; i < numbers.length; i++) {
            if ( numbers[i] % 2 == 0){
                pares[indicePar++] = numbers[i];
            }else{
                impares[indiceImpar++] = numbers[i];
            }
        }
        System.out.println("--------Lista de pares--------");
        for (int i = 0; i < pares.length; i++) {
            System.out.print(pares[i] + ", ");
        }



        System.out.println("\r\n---------Lista de impares--------");
        for (int i = 0; i < impares.length; i++) {
            System.out.print(impares[i] + ", ");
        }

    }
}
