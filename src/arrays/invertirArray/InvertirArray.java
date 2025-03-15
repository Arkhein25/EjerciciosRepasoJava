package arrays.invertirArray;

public class InvertirArray {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int i = 0;
        int f = numeros.length - 1; // ❌ ¿Qué es f?
        System.out.print("Arreglo original: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println(""); // No hace falta que pongas algo entre los paréntesis.
        // La siguiente operativa mejor en una función
        while (i < f) {
            int intercambio = numeros[i];
            numeros[i] = numeros[f];
            numeros[f] = intercambio;
            i++;
            f--;
        }
        System.out.print("Arreglo invertido: ");
        // Código similar a las líneas 9-11: ¿mejor en un método?
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }
}
