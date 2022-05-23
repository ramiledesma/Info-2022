
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String [] args) {
        System.out.println("Ingrese un numero entero: ");
        Scanner scanner = new Scanner(System.in);
        String numero = scanner.nextLine();
        int numero2 = Integer.parseInt(numero);
        String output = "";
        for (int i = 1; i <= numero2; i++) {
            output = output + " " + i;
            System.out.println(output);

        }
        scanner.close();

    }


}

