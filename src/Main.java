import java.util.Arrays;

public class Main {
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

        for (String producto : productos){

            System.out.println("producto = "  + producto);
        }

        for (int i = 0; i < productos.length; i++){
            System.out.println("para i = " + i + " valor " + productos[total-1-i]);

        }
        System.out.println("---------usando parametros--------------------------------");
        for (int i = total-1; i >= 0; i--){
            System.out.println("i = " + " valor " + productos[i]);
        }




    }
}