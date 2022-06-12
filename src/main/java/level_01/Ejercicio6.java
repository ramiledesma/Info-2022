package level_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio6 {


    public static void main(String [] args) throws IOException {
        System.out.println("Ingrese primer numero entero a multiplicar: ");
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        Integer entrada1 = Integer.valueOf(scan.readLine());

        System.out.println("Ingrese segundo numero entero: ");
        BufferedReader scan2 = new BufferedReader(new InputStreamReader(System.in));
        Integer entrada2 = Integer.valueOf(scan.readLine());
        int resultado = 1;
        int valorOriginal = entrada2;
        for(int i= 0; entrada2 > 0; i++ ) {
            resultado = resultado * entrada1;
            entrada2 -= 1;
        }

        System.out.println(entrada1 + " elevado a " + valorOriginal + " = " + resultado);


    }
}
