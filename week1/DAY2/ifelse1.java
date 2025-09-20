import java.util.*;

public class ifelse1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount of money you have: ");
        int money = sc.nextInt();
    System.out.print("Enter the price of chocolate: ");

    int price = sc.nextInt();

    if(price<=money)
    {
        System.out.println("You can buy the chocolate");
    }else
    {
        System.out.println("Not enough money");
    }

    sc.close();
}}
