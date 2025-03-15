package strings.conteoPalabras;

import java.util.Scanner;

public class ConteoPalabras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*** Conteo de Palabras ***");

        System.out.print("Ingresa la frase: ");
        String frase = scanner.nextLine();
        String palabraBuscada = "Hola";
        palabraBuscada = palabraBuscada.toLowerCase();

        String[] palabras = frase.split(" ");

        int cont = 0;
        for (String palabra : palabras) {
            if (palabra.toLowerCase().equals(palabraBuscada)) {
                cont++;
            }
        }
        System.out.println("La palabra " + palabraBuscada + " aparece " + cont + " veces en la frase");
        scanner.close();
    }
}
