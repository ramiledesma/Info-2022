package level_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String [] args) throws IOException {

        System.out.println("Ingrese los primeros 5 numeros enteros separados por ,");
        BufferedReader scan0 = new BufferedReader(new InputStreamReader(System.in)) ;
        String todosNumeros = scan0.readLine();

        String [] limpioArray = todosNumeros.split(",") ;
        ArrayList<String> numeros = new ArrayList<>();
        for (String i : limpioArray ){
            numeros.add(i);
        }

        for(int j= 0; j< numeros.size() ; j++) {
            System.out.println(numeros.get(j));
        }
        System.out.println("Tamaño de la lista antes de agregar numeros: " + numeros.size());

        System.out.println("Ingresar numero que desea agregar al principio de la lista");
        BufferedReader scan1 = new BufferedReader(new InputStreamReader(System.in));
        String numeroPrincipio = scan1.readLine();
        numeros.add(0,numeroPrincipio);


        System.out.println("Ingresar numero que desea agregar al final de la lista");
        BufferedReader scan2 = new BufferedReader(new InputStreamReader(System.in));
        String numeroFinal = scan2.readLine();
        numeros.add(numeros.size(),numeroFinal);

        for(int k= 0; k< numeros.size() ; k++) {
            System.out.println(numeros.get(k));
        }
        System.out.println("Tamaño de la lista luego de agregar numeros: " + numeros.size());

    }
}
