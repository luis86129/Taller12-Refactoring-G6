public class EmpleadoTemporario extends Empleado {
    private int mesesContrato;

    public EmpleadoTemporario(String nombre, double salarioBase, int horasTrabajadas, String departamento, int mesesContrato, String genero) {
        super(nombre, salarioBase, horasTrabajadas, 0.0, departamento, genero);
        this.mesesContrato = mesesContrato;
    }

    public int getMesesContrato() {
        return mesesContrato;
    }

    public void setMesesContrato(int mesesContrato) {
        this.mesesContrato = mesesContrato;
    }

    public String obtenerDetalles() {
        return String.format("Nombre: %s\nGénero: %s\nSalario: %.2f\nHoras trabajadas: %d\nDepartamento: %s\nMeses de contrato: %d",
                getNombre(), getGenero(), getSalarioBase(), getHorasTrabajadas(), getDepartamento(), mesesContrato);
    }
}