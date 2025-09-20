import java.util.Arrays;
import java.util.Scanner;

public class largest {
   public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int[]arr=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=s.nextInt();
    }
   int first=Integer.MIN_VALUE;
   int second=Integer.MIN_VALUE;
   for(int i=0;i<n;i++){
    if(arr[i]>first){
        second=first;
        first=arr[i];
    }
    else if(arr[i]>second && arr[i]!=first){
        second=arr[i];
    }
    else{
        System.out.println("no change");
    }
   }
   if(second==Integer.MIN_VALUE){
        System.out.println("no second value found");
   }
   else{
    System.out.println("second:"+second);
   }
   s.close();
}

}
