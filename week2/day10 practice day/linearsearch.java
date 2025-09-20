public class linearsearch{
    public static int linsea(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2, 4, 7, 1, 9};
        int key=7;
        int res=linsea(arr, key);
        if(res==-1){
            System.out.println("key not found");
        }
        else{
             System.out.printf("%d is found at index %d",key,res);
        }
    }
}