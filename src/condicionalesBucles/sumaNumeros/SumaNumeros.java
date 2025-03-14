package condicionalesBucles.sumaNumeros;

public class SumaNumeros {
    public static void main(String[] args) {
        System.out.println("*** Suma de los primeros 100 numeros naturales ***");

        int suma = 0;
        for (int i = 1; i <= 100; i++) {
            suma += +i;
            suma++;
        }
        System.out.println("La suma de los primeros 100 numeros naturales es: " + suma);
    }
}
