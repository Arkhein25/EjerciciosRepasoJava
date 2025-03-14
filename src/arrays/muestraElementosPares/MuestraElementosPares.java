package arrays.muestraElementosPares;

public class MuestraElementosPares {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int numero : numeros) {
            int resto = numero % 2;
            if (resto == 0) {
                System.out.println(numero);
            }
        }
    }
}
