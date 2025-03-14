package condicionalesBucles.palindromo;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*** Número Palíndromo ***");

        System.out.print("Ingresa el número a verificar: ");
        int numero = scanner.nextInt();

        String numString = Integer.toString(numero);

        String invertido = "";
        for (int i = numString.length() - 1; i >= 0; i--) {
            invertido += numString.charAt(i);
        }

        if (numString.equals(invertido)) {
            System.out.println("El número ingresado es un palíndromo");
        } else {
            System.out.println("El número ingresado no es un palíndromo");
        }
        scanner.close();
    }
}
