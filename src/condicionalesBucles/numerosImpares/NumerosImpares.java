package condicionalesBucles.numerosImpares;

public class NumerosImpares {
    public static void main(String[] args) {
        //con for
//        for (int i = 0; i < 50; i++) {
//            if (i % 2 != 0) {
//                System.out.println(i);
//            }
//        }

        //con while
        int cont = 1;
        while (cont <= 50) {
            if (cont % 2 != 0) {
                System.out.println(cont);
            }
            cont++;
        }
    }
}
