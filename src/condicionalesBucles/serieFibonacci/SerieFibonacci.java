package condicionalesBucles.serieFibonacci;

public class SerieFibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        for (int i = 2; i < 10; i++) {
            int nxt = a + b;
            a = b;
            b = nxt;
            System.out.println(nxt);
        }
    }
}
