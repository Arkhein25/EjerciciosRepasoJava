package conceptosBasicos.areaRectangulo;

import java.util.Scanner;

public class AreaRectangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ✅ Información al usuario de lo que hace el programa.
        System.out.println("*** Área de un rectángulo ***");
        //Pedir valores // No hace falta comentar el código simple
        System.out.print("Ingresa la base: ");
        int base = scanner.nextInt();
        System.out.print("Ingresa la altura: ");
        int altura = scanner.nextInt();
        System.out.println("");

        //realizar formula de área --> area=base*altura
        int areaDelRectangulo = base * altura;

        //mostrar valores
        // ✅ Información al usuario.
        System.out.println("*** Mostrando resultado ***");
        System.out.println("El área del rectangulo es: " + areaDelRectangulo + "cm");
        scanner.close();
    }
}
