import java.util.Scanner;

public class DesplazarIndice {
    public static void main(String[] args) {

        int[] numeros = new int[10];

        int ultimo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 10 numeros enteros");

        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();
        }

        ultimo = numeros[numeros.length -1];

        for (int i = numeros.length -2; i >=0; i--){
            numeros[i + 1] = numeros[ i ];
        }
        
        numeros[0] = ultimo;

        System.out.println("Asi queda el arreglo");
        for (int i = 0; i < numeros.length; i++){
            System.out.print(numeros[i] + ", ");
        }
    }
}
