package arrays.promedio;

public class Promedio {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int suma = 0;
        double promedio = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
            promedio = suma / numeros.length;
        }
        System.out.println(promedio);
    }
}
