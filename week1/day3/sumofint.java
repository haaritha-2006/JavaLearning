import java.util.Scanner;

public class sumofint {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sum=0;
        // for(int i=0;i<=n;i++){
        //     sum=sum+i;
            
        // }
        // int i=1;
        // while(i<=n){
        //     sum=sum+i;
        //     i++;
        // }
        int i=1;
        do{
            sum=sum+i;
            i++;
        }while(i<=n);
        System.out.println(sum);
    }
    
}
