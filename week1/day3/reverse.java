import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int org=num;
        int reversed=0;
        while(num>0){
            int digit=num%10;
            reversed=reversed*10+digit;
            num/=10;
        }
        System.out.println(reversed);
        if(org==reversed){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
    }
    
}
