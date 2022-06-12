package level_02;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ejercicio7 {



    public static void main(String [] args) throws IOException {

        System.out.println("Ingresa el primer numero");
        BufferedReader scan1 = new BufferedReader(new InputStreamReader(System.in));
        Integer x = Integer.parseInt(scan1.readLine());

        System.out.println("Ingresa el numero siguiente (Debe ser mayor al primer numero)");
        BufferedReader scan2 = new BufferedReader(new InputStreamReader(System.in));
        Integer y = Integer.parseInt(scan1.readLine());
        String [] array =  fizzBuzzFuncion(x,y);
        System.out.println(Arrays.toString(array));


    }

    public static String[] fizzBuzzFuncion(int a, int b) {
        String [] salida = new String[b-1];
        for (int i =a; i < b; i ++) {
            salida[i-1] = String.valueOf(i);
            if (i % 2 == 0) {
                salida[i-1]="Fizz";
            }
            if (i % 3 == 0) {
                salida[i-1]= "Buzz";
            }
            if (i % 2 == 0 && i % 3 == 0) {
                salida[i-1] = "FizzBuzz";
            }




        }

        return salida;
    }
}
