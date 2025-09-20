import java.util.*
public class selectionsort{
    public static void main(String[] args) {
        int arr[]={29, 10, 14, 37};
        for(int i=0;i<arr.length-1;i++){      //check outer loop length-1 as last element is not checked as it is in order
            int min_index=i;
            for(int j=i+1;j<arr.length;j++){    //checks all from right to left for smallest element
                if(arr[j]<arr[min_index]){
                     min_index=j;
                }
            }
            int temp=arr[i];                    //swap the index
            arr[i]=arr[min_index];
            arr[min_index]=temp;
        }
        System.out.println("sorted array");
        for(int k=0;k<arr.length;k++){
            System.out.println(arr[k]+" ");
        }
    }
}