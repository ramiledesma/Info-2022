import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String  [] args) {
        System.out.println("Ingrese primer numero entero: ");
        Scanner scanner1 = new Scanner(System.in);
        int numero1 = scanner1.nextInt();

        System.out.println("Ingrese segundo numero entero: ");
        Scanner scanner2 = new Scanner(System.in);
        int numero2 = scanner1.nextInt();

        System.out.println(numero1 +" + " + numero2 + " = " + sumaNumero(numero1,numero2));
        System.out.println(numero1 +" - " + numero2 + " = " + restaNumero(numero1,numero2));
        System.out.println(numero1 +" * " + numero2 + " = " + multiplicacionNumero(numero1,numero2));
        System.out.println(numero1 +" / " + numero2 + " = " + divisionNumero(numero1,numero2));
        System.out.println(numero1 +" % " + numero2 + " = " + restoNumero(numero1,numero2));


    }

    public static int sumaNumero(int num1, int num2) {
        return  num1 + num2;
    }

    public static int restaNumero(int num1, int num2) {
        return  num1 - num2;
    }

    public static  int multiplicacionNumero(int num1, int num2) {
        return  num1 * num2;
    }

    public static int divisionNumero(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Division por 0");
        } else {
            return num1 / num2;
        }

    }


    public static int restoNumero(int num1, int num2) {
        return  num1 % num2;
    }

}
