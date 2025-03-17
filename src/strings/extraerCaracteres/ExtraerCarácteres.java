package strings.extraerCaracteres;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ExtraerCarácteres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*** Extraer los 5 primeros dígitos de una palabra ***");
        System.out.print("Ingrese la palabra: ");
        String palabra = scanner.nextLine();
        if (palabra.length() >= 5) {
            String extraerCaracteres = palabra.substring(0, 5);
            System.out.println("Los primeros 5 carácteres de la palabra " + palabra + " son: " + extraerCaracteres);
        } else {
            System.err.println("Ingrese una palabra con mas de 5 carácteres");
        }
    }
}
