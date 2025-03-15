package strings.invertirPalabra;

import java.util.Scanner;

public class InvertirPalabra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*** Invertir Palabra ***");

        System.out.print("Ingresa palabra a invertir: ");
        String palabra = scanner.nextLine();

        String palabraInvertida = "";

        for (int i = palabra.length() - 1; i >= 0; i--) {
            palabraInvertida += palabra.charAt(i);
        }
        System.out.println("Palabra ingresada invertida: " + palabraInvertida);
        scanner.close();
    }
}
