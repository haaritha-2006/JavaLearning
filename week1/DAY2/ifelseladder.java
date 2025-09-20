import java.util.*;
public class ifelseladder {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter your age");
        int age=s.nextInt();
        if(age < 5){
            System.out.println("Ticket is Free");
        }
        else if(age >= 5 && age <= 12){
            System.out.println("Ticket price is ₹100");
        }
        else if(age > 12 && age <= 60){
            System.out.println("Ticket price is ₹200");
        }
        else{
            System.out.println("Ticket price is ₹150");
        }
    s.close(); 
    }
    
}
