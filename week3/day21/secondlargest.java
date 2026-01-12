import java.util.Scanner;

public class secondlargest {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        if(n<2){
            System.out.println("need to be atleast two elements");
            return;
        }
        int largest=Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                secondlargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>secondlargest && arr[i]!=largest){
            secondlargest=arr[i];
            }
        }
        if(secondlargest==Integer.MIN_VALUE){
            System.out.println("there is no second largest");
        }
        else{
            System.out.println("second largest number:"+secondlargest);
        }

    }
}
