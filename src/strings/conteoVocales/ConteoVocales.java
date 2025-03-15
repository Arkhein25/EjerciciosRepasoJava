package strings.conteoVocales;

import java.util.Scanner;

public class ConteoVocales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*** Conteo de Vocales en una palabra ***");

        System.out.print("Ingresa una palabra: ");
        String palabra = scanner.nextLine();

        //convirtiendo palabra a minusculas
        String palabraEnMinusculas = palabra.toLowerCase();

        char[] vocales = {'a', 'e', 'i', 'o', 'u'};

        int cont = 0;
        for (int i = 0; i < palabraEnMinusculas.length(); i++) {
            char caracter = palabraEnMinusculas.charAt(i);
            for (char vocal : vocales) {
                if (caracter == vocal) {
                    cont++;
                }
            }
        }
        System.out.println("La palabra ingresada tiene " + cont + " vocales");
        scanner.close();
    }
}
