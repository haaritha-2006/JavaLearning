import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int org=num;
        int reversed=0;
        if(num>0){            
            int digit=num%10;
            reversed=reversed*10+digit;
            num/=10;}
        if(org==reversed){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");

        }
        s.close();
    }
}
