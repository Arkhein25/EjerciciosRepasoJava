package arrays.buscarNumero;

import java.util.Scanner;

public class BuscarNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = {10, 20, 30, 40, 50, 60, 20, 80, 20};

        System.out.print("Ingresa el numero a buscar en el arreglo: ");
        int busca = scanner.nextInt();
        int cont = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (busca == numeros[i]) {
                cont++;
            }
        }
        System.out.println("El número ingresado aparece " + cont + " veces en el arreglo");
    }
}
