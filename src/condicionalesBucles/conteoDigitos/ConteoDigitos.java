package condicionalesBucles.conteoDigitos;

import java.util.Scanner;

public class ConteoDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*** Conteo de Dígitos de un Número ***");

        System.out.print("Ingresa el número a verificar: ");
        int numero = scanner.nextInt();
        System.out.println("");

        //convertir el numero a valor absoluto ❓ ¿Por qué lo pasas a número absoluto?
        int numeroAbsoluto = Math.abs(numero); // int numeroAbsoluto = ...
        int numDigitos = 0; // int numDigitos = 0
        while (numeroAbsoluto > 0) {
            numeroAbsoluto /= 10;
            numDigitos++;
        }
        System.out.println("el numero tiene " + numDigitos + " dígitos");
        scanner.close();
    }
}
