import java.util.*;
public class numberguess{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        Random rand=new Random();
        System.out.println("WELCOME TO NUMBER GUESSING GAME");
        int numbertoguess=rand.nextInt(100)+1;
        int guess=0;
        int attempt=0;
        while(guess!=numbertoguess){
            System.out.println("enter the number:");
            guess=s.nextInt();
            attempt++;
            if(guess<numbertoguess){
                System.out.println("Too low!! Try again");
            }
            else if(guess>numbertoguess){
                System.out.println("Too high!! Try again.");
            }
            else{
                System.out.printf("Correct Guess : %d in attempt number %d",numbertoguess,attempt);
            }
        }
        s.close();
        System.out.println("GAME OVER.Thanks for playing.");
    }
}