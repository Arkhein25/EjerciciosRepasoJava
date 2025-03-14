package arrays.invertirArray;

public class InvertirArray {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int i = 0;
        int f = numeros.length - 1;
        System.out.print("Arreglo original: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println("");
        while (i < f) {
            int intercambio = numeros[i];
            numeros[i] = numeros[f];
            numeros[f] = intercambio;
            i++;
            f--;
        }
        System.out.print("Arreglo invertido: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }
}
