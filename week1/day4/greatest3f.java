public class greatest3f {
    public static int g3(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }

    }

    public static void main(String[] args) {
        int res = g3(10, 30, 5);
        System.out.println(res);
    }
}
