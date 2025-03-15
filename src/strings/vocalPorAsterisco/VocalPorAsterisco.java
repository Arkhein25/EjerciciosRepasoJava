package strings.vocalPorAsterisco;

import java.util.Scanner;

public class VocalPorAsterisco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*** Cambiar Vocal por Asterisco ***");

        System.out.print("Ingresa la palabra: ");
        String palabra = scanner.nextLine();
        String palabraEnMnusculas = palabra.toLowerCase();
        char[] vocales = {'a', 'e', 'i', 'o', 'u'};
        String vocalesPorAsterisco = "";

        for (int i = 0; i < palabraEnMnusculas.length(); i++) {
            char caracter = palabraEnMnusculas.charAt(i);
            boolean esvocal = false;
            for (char vocal : vocales) {
                if (caracter == vocal) {
                    vocalesPorAsterisco += "*";
                    esvocal = true;
                }
            }
            if (!esvocal) {
                vocalesPorAsterisco += caracter;
            }
        }
        System.out.println("Nueva palabra cambiada: " + vocalesPorAsterisco);
        scanner.close();
    }
}
