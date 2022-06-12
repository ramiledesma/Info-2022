package level_02;


import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio3 {
    public static void main(String [] args) {
        ArrayList<String> barajaFrancesa = new ArrayList<>();
        barajaFrancesa.add("A");
        barajaFrancesa.add("2");
        barajaFrancesa.add("3");
        barajaFrancesa.add("4");
        barajaFrancesa.add("5");
        barajaFrancesa.add("6");
        barajaFrancesa.add("7");
        barajaFrancesa.add("8");
        barajaFrancesa.add("9");
        barajaFrancesa.add("10");
        barajaFrancesa.add("J");
        barajaFrancesa.add("Q");
        barajaFrancesa.add("K");
        System.out.println("barajaFrancesa = " + barajaFrancesa);
        Collections.reverse(barajaFrancesa);
        System.out.println("barajaFrancesa invertida = " + barajaFrancesa);
        Collections.shuffle(barajaFrancesa);
        System.out.println("barajaFrancesa desordenada = " + barajaFrancesa);


    }
}
