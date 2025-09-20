import java.util.*;
public class arithmetic {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.printf("sum=%d\n",a+b);
        System.out.printf("diff=%d\n",a-b);
        System.out.printf("prod=%d\n",a*b);
        System.out.printf("div=%d\n",a/b);
        System.out.printf("mod=%d\n",a%b);
        System.out.printf("equal=%b",a==b);
        System.out.printf("greater=%b",a>b);
    }
}
