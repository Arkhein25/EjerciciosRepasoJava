package conceptosBasicos.areaRectangulo;

import java.util.Scanner;

public class CelciusFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*** Calcular grados celcius a fahrenheit ***");
        //solicitar valores
        System.out.println("Ingresa grados Celcius: ");
        int celsius = scanner.nextInt();
        System.out.println("");

        //hacer calculo de celcius a fahrenheit
        double fahrenheit = (celsius * 1.8) + 32;

        //mostrar datos por pantalla
        System.out.println("*** Mostrando conversion a fahrenheit ***");
        System.out.println("Gados fahrenheit: " + fahrenheit);
        scanner.close();
    }
}
