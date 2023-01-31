import java.util.Arrays;
import java.util.Collections;

public class ArreglosForInversoMutable {

    public static void revierteArreglo(String[] arreglo){
        int total = arreglo.length;
        int total2 = arreglo.length;

        for (int i = 0; i < total2; i++) {
            String actual = arreglo[i];
            String inverso = arreglo[total - 1 - i];
            arreglo[i] = inverso;
            arreglo[total - 1 - i] = actual;
            total2--;
        }
    }
    public static void main(String[] args) {

        String[] productos = new String[7];
        int total = productos.length;

        productos[0] = "Kingston Drive 64gb";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta generacion";
        productos[6] = "Bicicleta Oxford";

        Arrays.sort(productos);

        //revierteArreglo(productos);

        Collections.reverse(Arrays.asList(productos));

        for (String producto : productos){

            System.out.println("producto = "  + producto);
        }

        System.out.println("-----------------------------");


        for (String producto : productos){

            System.out.println("producto = "  + producto);
        }
    }
}
