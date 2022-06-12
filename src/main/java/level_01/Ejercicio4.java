package level_01;


import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        System.out.println("Ingrese el numero que desea conocer su factorial");
        Scanner scan = new Scanner(System.in);
        Integer input = scan.nextInt();
        System.out.println("El factorial de " + input + " es: " + recursion(input));



    }
    
    public static int recursion(int numero) {

        if (numero == 0) {
            return 1;
        }

        return numero = recursion(numero - 1) * numero;

    }

}
