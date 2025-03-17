package strings.convertirAMayusculas;

import java.util.Scanner;

public class ConvertirAMayusculas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*** Convertir palabra a mayusculas sin usar UpperCase() ***");

        System.out.print("Ingresa la palabra a convertir a mayúsculas: ");
        String palabra = scanner.nextLine();
        char[] minusculas = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] mayusculas = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'Ñ', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        String nuevaPalabra = "";

        for (int i = 0; i < palabra.length(); i++) {
            char caracter = palabra.charAt(i);
            boolean esMinuscula = false;
            for (int j = 0; j < minusculas.length; j++) {
                if (caracter == minusculas[j]) {
                    nuevaPalabra += mayusculas[j];
                    esMinuscula = true;
                }
            }
            if (!esMinuscula) {
                nuevaPalabra += caracter;
            }
        }
        System.out.println("La palabra " + palabra + " convertida a mayúsculas es: " + nuevaPalabra);

    }
}
