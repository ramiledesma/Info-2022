package level_02;

import java.util.ArrayList;

public class Ejercicio5 {
    public static void main(String [] args) {
        ArrayList<Integer> array1 = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();
        array1.add(6);
        array1.add(7);
        array1.add(8);
        array1.add(4);
        array1.add(5);
        array2.add(350);
        array2.add(345);
        array2.add(550);
        array2.add(600);
        array2.add(320);
        ArrayList<Integer> trabajoXhoras = new ArrayList<>();
        int totfinal = 0;
        for(int i = 0; i < array1.size(); i++) {
            trabajoXhoras.add(array1.get(i) * array2.get(i));
            totfinal = totfinal + trabajoXhoras.get(i);
        }
        System.out.println(trabajoXhoras);
        System.out.println("Total Final: $" + totfinal);

    }
}
