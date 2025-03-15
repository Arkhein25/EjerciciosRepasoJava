package arrays.compararArrays;

public class CompararArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 5, 3, 4, 5, 6, 7, 8, 9};
        int[] array2 = {1, 2, 3, 4, 8, 6, 7, 8, 9};
        boolean tienenMismaLongitud = (array1.length == array2.length);
        if (tienenMismaLongitud) {
            boolean sonIguales = true;
            for (int i = 0; i < array1.length; i++) {
                // Vimos este tipo de expresiones en clase.
                // Úsalas cuando convenga.
                sonIguales = (array1[i] != array2[i]);
            }
            if (sonIguales) {
                System.out.println("Los arreglos son iguales");
            }else {
                // Para denotar esta situación, es preferible: System.err.println("...");
                System.out.println("Los arreglos no son iguales");
            }
        } else {
            System.out.println("Los arreglos no tienen la misma longitud.");
        }
    }
}

