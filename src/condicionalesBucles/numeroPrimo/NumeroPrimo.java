package condicionalesBucles.numeroPrimo;

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*** Números Primos ***");

        //solicitar numero al usuario
        System.out.print("Ingresa número a verificar: ");
        int numero = scanner.nextInt();

        //realizando operaciones de validación
        boolean esPrimo = true;
        if (numero > 1) {
            esPrimo = false;
        } else {
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                }
            }
        }

        if (esPrimo) {
            System.out.println("El numero ingresado no es primo");
        } else {
            System.out.println("El número ingresado es primo");
        }
        scanner.close();
    }
}
