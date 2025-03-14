package conceptosBasicos.areaRectangulo;

import java.util.Scanner;

public class PromedioNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //solicitando numeros al usuario
        System.out.print("Ingresa el primer número: ");
        double num1 = scanner.nextInt();
        System.out.print("Ingresa el segundo número: ");
        double num2 = scanner.nextInt();
        System.out.print("Ingresa el tercer número: ");
        double num3 = scanner.nextInt();
        System.out.println("");
        //calculando el promedio
        double promedio = (num1 + num2 + num3) / 3;

        //imprimiendo en pantalla
        System.out.println("*** Promedio ***");
        System.out.printf("El promedio de los 3 numero es: %.2f%n", promedio);
        scanner.close();
    }
}
