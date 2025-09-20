import java.util.*;
public class bubblesort {
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[]args){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int[]arr=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=s.nextInt();
    }
    for(int i=0;i<n-1;i++){
        for(int j=0;j<n-i-1;j++){
            if(arr[j]>arr[j+1]){
                swap(arr,j,j+1);
            }
        }
    }
    for(int i=0;i<n;i++){
        System.out.println(arr[i]);
    }
    s.close();
    }
}
