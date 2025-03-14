package arrays.numeroMenor;

public class NumeroMenor {
    public static void main(String[] args) {
        int[] numero = {25, 26, 27, 28, 29, 30};
        int min = numero[0];
        for (int i = 0; i < numero.length; i++) {
            if (min < i) {
                min = numero[i];
            }
        }
        System.out.println(min);
    }
}
