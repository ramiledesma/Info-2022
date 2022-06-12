package level_01;

import java.util.Scanner;

public class Ejercicio1 {


    public static void main(String [] args) {
        System.out.println("Ingrese nombre de Usuario: ");
        Scanner scanner = new Scanner(System.in);
        String nombre = scanner.nextLine();
        System.out.println("HOLA {"+nombre+"}!!!");

    }

}
