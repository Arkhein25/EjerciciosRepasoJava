package conceptosBasicos.areaRectangulo;

import java.util.Scanner;

public class AreaRectangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Pedir valores
        System.out.println("*** Área de un rectángulo ***");
        System.out.print("Ingresa la base: ");
        int base = scanner.nextInt();
        System.out.print("Ingresa la altura: ");
        int altura = scanner.nextInt();
        System.out.println("");

        //realizar formula de área --> area=base*altura
        int areaDelRectangulo = base * altura;

        //mostrar valores
        System.out.println("*** Mostrando resultado ***");
        System.out.println("El área del rectangulo es: " + areaDelRectangulo + "cm");
        scanner.close();
    }
}
