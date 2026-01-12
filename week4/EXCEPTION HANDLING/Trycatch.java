/*
📝 SMALL PRACTICE (DO THIS)

1️⃣ Take number from user
2️⃣ Convert using Integer.parseInt()
3️⃣ Handle invalid input using try-catch
*/

import java.util.*;
public class Trycatch{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        try{
            int num1=Integer.parseInt(s.nextLine());
            System.out.println("You entered: " + num1);
        }catch(NumberFormatException e){
            System.out.println("please enter correct number!");
        }
        finally{
            s.close();//CAN CLOSE SCANNER IN FINALLY
            System.out.println("program finished execution");
        }
    }
}