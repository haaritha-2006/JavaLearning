public class selection {
    public static void main(String[] args) {
        int arr[]={34,6,3,17};
        for(int i=0;i<arr.length-1;i++){
            int min_index=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min_index];
            arr[min_index]=temp;
        }
        System.out.println("sorted:");
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]);
        }
    }
}
