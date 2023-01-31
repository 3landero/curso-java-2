import java.util.Scanner;

public class InsertarIndiceDesplazar {
    public static void main(String[] args) {

        int[] numeros = new int[10];
        int elemento, posicion;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numeros.length -1; i++) {
            System.out.print("Ingrese numero :");
            numeros[i] = scanner.nextInt();
        }

        System.out.println();

        System.out.println("Ingrese nuevo elemento :");
        elemento = scanner.nextInt();

        System.out.println("Ingrese la posicion de 0 a 9");
        posicion = scanner.nextInt();

        for (int i = numeros.length -2; i >= posicion; i--){
            numeros[i + 1] = numeros[ i ];
        }
        
        numeros[posicion] = elemento;

        System.out.println("Asi queda el arreglo");
        for (int i = 0; i < numeros.length; i++){
            System.out.print(numeros[i] + ", ");
        }
    }
}
