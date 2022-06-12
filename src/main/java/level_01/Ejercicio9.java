package level_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio9 {
    public static void main(String [] args) throws IOException {
        System.out.println("Ingrese un texto a evaluar: ");
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        char[] palabraAcaracter = (scan.readLine()).toCharArray();

        System.out.println("Ingrese la letra que desea buscar su cantidad de ocurrencia: ");
        BufferedReader scan2 = new BufferedReader(new InputStreamReader(System.in));
        String letra = scan2.readLine();
        Integer contar = 0;
        for (int i = 0; i < palabraAcaracter.length; i++) {

            if (palabraAcaracter[i] == letra.charAt(0) ) {
                contar +=  1;
            }
        }

        System.out.println(contar);

    }
}
