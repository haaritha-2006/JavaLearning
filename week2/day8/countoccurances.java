public class countoccurances {
    public static int countocc(int arr[],int key){
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={2,3,2,5,11,13,2,2};
        int key=2;
        int result=countocc(arr, key);
        System.out.println(result);
    }
}
