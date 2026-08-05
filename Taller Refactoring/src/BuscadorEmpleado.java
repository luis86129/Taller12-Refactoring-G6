import java.util.List;

public class BuscadorEmpleado {
    //refactorizacion usadaS: Extract Method
    public static Empleado buscarEmpleadoPorNombre(String nombre,List<Empleado> empleados) {
        for (Empleado empleado : empleados) {
            if (esElEmpleado(empleado, nombre)) {
                return empleado;
            }
        }
        return null;
    }

    //Metodo Extraida de buscarEmpleadoPorNombre para que sea utilizable de manera mas general
    private static boolean esElEmpleado(Empleado empleado, String nombre) {
        return empleado.getNombre().equals(nombre);
    }

    //Más Metodos
}