import java.util.Scanner;

public class MaxNumberArray {
    public static void main(String[] args) {

        int[] numbers = new int[5];
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese 5 numeros enteros");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = s.nextInt();
        }

        int max = 0;

        for (int i = 0; i < numbers.length; i++) {
            max = (max > numbers[i]) ? max : numbers[i];
        }

        System.out.println("El numero mas alto es " + max);


    }
}
