import java.util.Scanner;

public class areacircle {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int radius=s.nextInt();
        double area=Math.PI*radius*radius;
        System.out.printf("area=%.2f",area);
        s.close();
    }
    
}
