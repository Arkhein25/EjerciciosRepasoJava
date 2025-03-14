package conceptosBasicos.areaRectangulo;

import java.util.Scanner;

public class AreayCircunferencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //solicitar datos al usuario
        System.out.print("Ingrese el radio de la circunferencia: ");
        double radio = scanner.nextDouble();
        scanner.nextLine();

        //realizar calculos
        //Area= 𝜋*r^2
        //Circunferencia= 2*𝜋*r
        double area = Math.PI * Math.pow(radio, 2);
        double circuferencia = 2 * Math.PI * radio;

        //imprimir datos por pantalla
        System.out.println("*** Area y circunferencia del círculo ***");
        System.out.printf("Área del círculo: %.2f%n", area);
        System.out.printf("Circuferencia del circulo: %.2f%n", circuferencia);
        scanner.close();
    }
}
