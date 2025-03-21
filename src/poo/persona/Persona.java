package poo.persona;

public class Persona {
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{Nombre: " + nombre +
                ", Edad: " + edad + "}";

    }

    public void saludar() {
        System.out.println("Hola mi nombre es " + nombre + ", tengo " + edad + " Años");
    }
}