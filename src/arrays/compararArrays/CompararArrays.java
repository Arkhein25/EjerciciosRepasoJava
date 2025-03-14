package arrays.compararArrays;

public class CompararArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] array2 = {1, 2, 3, 4, 8, 6, 7, 8, 9};
        if (array1.length == array2.length) {
            boolean sonIguales = true;
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) {
                    sonIguales = false;
                }
            }
            if (sonIguales) {
                System.out.println("Los arreglos son iguales");
            }else {
                System.out.println("Los arreglos no son iguales");
            }
        } else {
            System.out.println("Los arreglos son iguales");
        }
    }
}

