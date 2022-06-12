package level_02;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Empleados {

    public int dni;
    public String nombreYapellido;
    public int horasTrabajadas;
    public int valorPorhora;
    public Empleados(int dni, String nombreYapellido, int horasTrabajadas, int valorPorhora) {
        this.dni = dni;
        this.nombreYapellido = nombreYapellido;
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorhora = valorPorhora;

    }

    @Override
    public String toString() {
        return String.valueOf(this.dni) +
                "-" + this.nombreYapellido;
    }
}

public class Ejercicio6 {

    public static void main(String[] args) {
        Set<Empleados> empleados = new HashSet<Empleados>();
        Map<Integer, Integer> dniYsueldo = new HashMap<>();
        empleados.add(new Empleados(36407288, "Diaz Fabricio", 8, 770));
        empleados.add(new Empleados(33400123, "Gomez Gregorio", 6, 770));

        for(Empleados emplead : empleados) {
            dniYsueldo.put(emplead.dni, emplead.horasTrabajadas * emplead.valorPorhora);
        }

        for (Map.Entry<Integer,Integer> registro: dniYsueldo.entrySet()) {
            System.out.println(" Dni = " + registro.getKey() + " Sueldo Calculado: " + registro.getValue());
        }


    }




}
