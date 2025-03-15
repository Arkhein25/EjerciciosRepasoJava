package conceptosBasicos.areaRectangulo;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*** Par o Impar ***");

        //solicitando numero
        System.out.print("Ingrese número: ");
        int numero = scanner.nextInt();
        scanner.nextLine();
        
        //validación
        // boolean esPar = (numero % 2 == 0);
        // if (esPar)...
        if (numero % 2 == 0) {
            System.out.println("El número ingresado es par");
        } else {
            System.out.println("El número ingresado es impar");
        }
        scanner.close();
    }
}
