package level_02;

import java.util.ArrayList;

public class Ejercicio4 {
    public static void main(String [] args){
        ArrayList<String> nombresEstudiantes = new ArrayList<String>();
        nombresEstudiantes.add("Fabricio");
        nombresEstudiantes.add("German");
        nombresEstudiantes.add("Martin");
        nombresEstudiantes.add("Aldo");
        nombresEstudiantes.add("Ramiro");
        nombresEstudiantes.add("Oscar");
        nombresEstudiantes.add("Walter");
        nombresEstudiantes.add("Matias");
        nombresEstudiantes.add("Nicolas");
        nombresEstudiantes.add("Gustavo");
        nombresEstudiantes.add("Lisandro");
        nombresEstudiantes.add("Mateo");

        ArrayList<String> curso1 = new ArrayList<String>(nombresEstudiantes.subList(0, 4));
        ArrayList<String> curso2 = new ArrayList<String> (nombresEstudiantes.subList(4,8));
        ArrayList<String> curso3 = new ArrayList<String> (nombresEstudiantes.subList(8,12));

        System.out.println("Curso 1 = " + curso1);
        System.out.println("Curso 2 = " + curso2);
        System.out.println("Curso 3 = " + curso3);

    }
}
