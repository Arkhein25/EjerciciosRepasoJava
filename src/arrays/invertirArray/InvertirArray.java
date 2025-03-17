package arrays.invertirArray;

public class InvertirArray {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.print("Arreglo original: ");
        recorrrerNumeros(numeros);
        System.out.println(); // No hace falta que pongas algo entre los paréntesis.

        invertirArreglo(numeros);

        System.out.print("Arreglo invertido: ");
        recorrrerNumeros(numeros);
    }

    public static void recorrrerNumeros(int[] numeros) {
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }

    public static void invertirArreglo(int[] numeros) {
        int i = 0;
        int f = numeros.length - 1; // ❌ ¿Qué es f?
        while (i < f) {
            int intercambio = numeros[i];
            numeros[i] = numeros[f];
            numeros[f] = intercambio;
            i++;
            f--;
        }
    }
}
