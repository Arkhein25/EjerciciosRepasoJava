package condicionalesBucles.conteoDigitos;

import java.util.Scanner;

public class ConteoDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*** Conteo de Dígitos de un Número ***");

        System.out.print("Ingresa el número a verificar: ");
        int numero = scanner.nextInt();
        System.out.println("");

        //convertir el numero a valor absoluto
        int absoluto = Math.abs(numero);
        int cont = 0;
        while (absoluto > 0) {
            absoluto /= 10;
            cont++;
        }
        System.out.println("el numero tiene " + cont + " dígitos");
        scanner.close();
    }
}
