package strings.concatenarCadenas;

import java.util.Scanner;

public class ConcatenarCadenas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*** Concatenar cadenas ***");

        System.out.print("Ingresa la primera palabra a concatenar: ");
        String palabra1 = scanner.nextLine();
        System.out.print("Ingresa la segunda palabra a concatenar: ");
        String palabra2 = scanner.nextLine();

        String palabraConcatenada = "";
        char caracter;

        for (int i = 0; i < palabra1.length(); i++) {
            caracter = palabra1.charAt(i);
            palabraConcatenada += caracter;
        }
        for (int j = 0; j < palabra2.length(); j++) {
            caracter = palabra2.charAt(j);
            palabraConcatenada += caracter;
        }
        System.out.println("La palabra concatenada es: " + palabraConcatenada);
    }
}
