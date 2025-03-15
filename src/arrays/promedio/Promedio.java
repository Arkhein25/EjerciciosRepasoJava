package arrays.promedio;

public class Promedio {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int suma = 0;
        double promedio = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];

            // ¿Por qué calculas el promedio en cada iteración?
            promedio = (double) suma / numeros.length;
        }
        // El promedio es: XX.XX
        System.out.println(promedio);
    }
}
