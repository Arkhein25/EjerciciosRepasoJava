package condicionalesBucles.numeroFactorial;

import java.util.Scanner;

public class NumeroFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*** Número Factorial ***");
        System.out.print("Ingresa el número a realizar su factorial: ");
        int numero = scanner.nextInt();

        int factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        // "El factorial de X es Y"
        System.out.println(numero + "!= " + factorial);
        scanner.close();
    }
}
