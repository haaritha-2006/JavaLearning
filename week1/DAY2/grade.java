import java.util.*;
public class grade {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int mark=s.nextInt();
        switch(mark/10){
            case 10:{
            System.out.print("grade=A");
            break;
            }
            case 9:{
            System.out.print("grade=B");
            break;
            }
            case 8:{
            System.out.print("grade=c");
            break;
            }
            case 7:{
            System.out.print("grade=D");
            break;
            }
            case 6:{
            System.out.println("grade=fail");
            break;
            }
            default:{
                System.out.println("inalid input");
            }

        }
        s.close();
    }
}
