package strings.listaDePalabras;

import java.util.Scanner;

public class ListaDePalabras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*** Lista de palabras ***");

        System.out.print("Ingresa la frase a listar: ");
        String frase = scanner.nextLine();

        String[] palabra = frase.split(" ");

        for (int i = 0; i < palabra.length; i++) {
            System.out.println(palabra[i]);
        }
    }
}
