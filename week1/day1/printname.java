import java.util.*;
public class printname{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        String name=s.next();
        int age=s.nextInt();
        System.out.print("Hello "+name+",you are "+age+"years old");
    }
}