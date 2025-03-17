package poo.persona;

public class Empleado extends Persona {
    double salario;
    String puesto;


    public Empleado(String nombre, int edad, double salario, String puesto) {
        super(nombre, edad);
        this.puesto = puesto;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return "*** Informacion del Empleado ***\n" +
                "Nombre: " + nombre + "\n" +
                "Edad: " + edad + "\n" +
                "Puesto: " + puesto + "\n" +
                "Salario: " + salario;
    }
}
