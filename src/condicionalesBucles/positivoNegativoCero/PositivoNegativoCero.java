package condicionalesBucles.positivoNegativoCero;

import java.util.Scanner;

public class PositivoNegativoCero {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("*** Número positivo, negativo o cero ***");

        //solicitar numero al usuario
        System.out.print("Ingresa el numero a verificar: ");
        double numero=scanner.nextDouble();

        //realizar verificación si el número es positivo, negativo o cero
        if(numero>0){
            System.out.println("El número ingresado es positivo");
        }else if(numero<0){
            System.out.println("El número ingresado es negativo");
        }else{
            System.out.println("El número ingresado es cero");
        }
        scanner.close();
    }
}
