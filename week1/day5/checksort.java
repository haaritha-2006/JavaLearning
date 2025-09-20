
import java.util.*;
public class checksort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println("original:"+a[i]+" ");
        }
        boolean sorted=true;
        for(int i=0;i<n-1;i++){
            if(a[i]>a[i+1]){
                sorted=false;
                break;
            }
        }
        if(sorted==true){
            System.out.println("sorted");
        }
        else{
            System.out.println("unsorted");
        }
    }
}
