package level_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio8 {
    public static void main(String [] args) throws IOException {
        System.out.println("Ingrese Nombre y Apellido ");
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        String nombreYapellido = scan.readLine();

        System.out.println("Ingrese su edad ");
        BufferedReader scan2 = new BufferedReader(new InputStreamReader(System.in));
        Integer edad = Integer.valueOf(scan2.readLine());

        System.out.println("Ingrese su direccion ");
        BufferedReader scan3 = new BufferedReader(new InputStreamReader(System.in));
        String direccion = scan3.readLine();

        System.out.println("Ingrese su ciudad ");
        BufferedReader scan4 = new BufferedReader(new InputStreamReader(System.in));
        String ciudad = scan4.readLine();

        String salida = String.format("%s - %s - %s - %s",ciudad, direccion, edad, nombreYapellido);
        System.out.println(salida);
    }
}
