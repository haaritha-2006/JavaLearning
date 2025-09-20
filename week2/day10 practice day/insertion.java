public class insertion {
    public static void main(String[] args) {
        int arr[]={34,4,9,1};
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        System.out.println("sorted:");
        for(int k=0;k<arr.length;k++){
            System.out.println(arr[k]+" ");
        }
    }
}
