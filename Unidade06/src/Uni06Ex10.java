public class Uni06Ex10 {
    public static void main(String[] args) {
        int a, b, c;
        a = 0;
        b = 15;
        c = 0;
        while (a <= b) {
               a = a + 3;
               b = b - a;
               c = b - a;
        }
       System.out.println(a);
       System.out.println(b);
       System.out.println(c);

    }
}
