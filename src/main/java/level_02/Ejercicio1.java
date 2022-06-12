package level_02;

import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String [] args) {


        ArrayList<String> ciudadesFav = new ArrayList<>();
        ciudadesFav.add("Mendoza");
        ciudadesFav.add("Cordoba");
        ciudadesFav.add("Misiones");
        String output = "";
        for(int i=0; i < ciudadesFav.size(); i++) {

            output = String.format("#%s - %s",(i+1),ciudadesFav.get(i));
            System.out.println(output);
        }
    }

}
