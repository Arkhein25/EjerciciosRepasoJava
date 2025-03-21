package poo.persona;

public class Coche {
    String marca;
    String modelo;
    int anio;

    public Coche(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Coche: Marca: " + marca + ", Modelo: " + modelo + ", Año de Fabricación: " + anio;
    }

    public void acelerar() {
        System.out.println("El coche: " + marca + " con modelo: " + modelo + " acelera 20km/h");
    }
}
