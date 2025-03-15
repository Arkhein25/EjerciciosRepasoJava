package strings.palindromo;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*** Palíndromo ***");

        System.out.print("Ingrese palabra a verificar: ");
        String palabra = scanner.nextLine();

        String palabraInvertida = "";

        for (int i = palabra.length() - 1; i >= 0; i--) {
            palabraInvertida += palabra.charAt(i);
        }
        if (palabra.equals(palabraInvertida)) {
            System.out.println("La palabra introducida es un palíndromo");
        } else {
            System.out.println("La palabra introducida no es un palíndromo");
        }
        scanner.close();
    }
}
