import java.util.Scanner;

public class BuscarEntero {
    public static void main(String[] args) {
        int[] a = new int[10];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese un numero:  ");
            a[i] = scanner.nextInt();
        }

        System.out.println("\r\n Ingrese numero a buscar");
        int num = scanner.nextInt();

        int f =0;

        while ( f < a.length && a[f] != num){
            f++;
            if (f == a.length){
                System.out.println("Numero no encontrado");
            }else if(num == a[f]){
                System.out.println("Encontrado en el indice " + ( f + 1 ));
            }
        }
    }
}
