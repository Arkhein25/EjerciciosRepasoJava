package arrays.numeroMayor;

// ❌ No funciona
public class NumeroMayor {
    public static void main(String[] args) {
        int[] numero = {80, 25, 30, 35, 40, 50};
        int max = numero[0];
        for (int i = 0; i < numero.length; i++) {
            if (max < numero[i]) {
                max = numero[i];
            }
        }
        System.out.println(max);
    }
}
