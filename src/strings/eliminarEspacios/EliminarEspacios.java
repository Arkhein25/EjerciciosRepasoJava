package strings.eliminarEspacios;

import java.util.Scanner;

public class EliminarEspacios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*** Eliminar espacios de una frase ***");
        System.out.print("Ingresa frase: ");
        String frase = scanner.nextLine();
        String fraseSinEspacios = "";
        for (int i = 0; i < frase.length(); i++) {
            String caracter = String.valueOf(frase.charAt(i));
            if (!caracter.equals(" ")) {
                fraseSinEspacios += caracter;
            }
        }
        System.out.println("La frase ingresada sin espacios es: " + fraseSinEspacios);
    }
}
