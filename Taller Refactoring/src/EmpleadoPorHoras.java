public class EmpleadoPorHoras extends Empleado {
    private double tarifaHora;

    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double tarifaHora, String departamento, String genero) {
        super(nombre, 0, horasTrabajadas, tarifaHora, departamento, genero);
<<<<<<< Updated upstream
        this.tarifaHora = tarifaHora; 
=======
>>>>>>> Stashed changes
        super.setSalarioBase(calcularSalario());
    }

    @Override
    public void imprimirDetalles() {
        super.imprimirDetalles();
        System.out.println("Tarifa por hora: " + this.tarifaHora); 
    }

    @Override
    public double calcularSalario() {
        double salario = super.getHorasTrabajadas() * this.getTarifaHora();
        return salario;
    }

    public double getTarifaHora() {
        return tarifaHora;
    }

    public void setTarifaHora(double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }

    // Más metodos
}