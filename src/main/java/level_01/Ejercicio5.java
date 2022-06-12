package level_01;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String [] args) {
        System.out.println("Ingrese primer numero entero a multiplicar: ");
        Scanner scan1 = new Scanner(System.in);
        int numero1 = scan1.nextInt();

        System.out.println("Ingrese segundo numero entero a multiplicar: ");
        Scanner scan2 = new Scanner(System.in);
        int numero2 = scan2.nextInt();
        int resultado = 0; 
        for (int i = numero2; i != 0; i-- ) {
            resultado = numero1 + resultado;
            
        }
        System.out.println(numero1 + " x " + numero2 +" = " + resultado);


    }
}
