package condicionalesBucles.tablaMultiplicar;

import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*** Tabla de multiplicar ***");

        //pedir numero al usuario
        System.out.print("Ingresa el número para mostrar su tabla de multiplicar: ");
        int numero = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            int mult = numero * i;
            System.out.println(numero + " x " + i + " = " + mult);
        }
        scanner.close();
    }
}
