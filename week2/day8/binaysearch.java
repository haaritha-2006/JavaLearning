public class binaysearch {
    public static int bin(int arr[],int key){
        int beg=0;
        int end=arr.length-1;
        while(beg<=end){
            int mid=(beg+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]<key){
                    beg=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1; 
    }
    public static void main(String[] args) {
        int arr[]={2,5,6,7,8,45,67,89};
        int key=5;
        int result=bin(arr, key);
        if(result!=-1){
            System.out.println(result);
        }
        else{
            System.out.println("element not found");
        }
        
    }
}
