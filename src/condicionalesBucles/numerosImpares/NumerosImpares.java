package condicionalesBucles.numerosImpares;

public class NumerosImpares {
    public static void main(String[] args) {
        // Borra el código comentado.
        //con for
//        for (int i = 0; i < 50; i++) {
//            if (i % 2 != 0) {
//                System.out.println(i);
//            }
//        }

        //con while
        int cont = 1;
        while (cont <= 50) {
            // 🙏 Aprovecha para trabajar con booleanos.
            if (cont % 2 != 0) {
                // ¿Sabrá el usuario qué significan estos números?
                System.out.println(cont);
            }
            cont++;
        }
    }
}
