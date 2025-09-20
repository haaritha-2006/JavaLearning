public class binarysearch {
    public static int binsea(int arr[],int key){
        int beg,end,mid;
        beg=0;
        end=arr.length-1;
        while(beg<=end){
            mid=(beg+end)/2;
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
        int arr[]={1, 3, 5, 7, 9, 11};
        int key=7;
        int res=binsea(arr, key);
        if(res==-1){
            System.out.println("key not found in this array");
        }
        else{
            System.out.printf("%d is found at position %d",key,res);
        }
    }
}
