import java.util.Scanner;

public class rev {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int rev=0;
        int num=s.nextInt();
        
        while(num>0){
            int digit=num%10;
            rev=rev*10+digit;
            num/=10;
            System.out.println(rev);
        }
    }
}
