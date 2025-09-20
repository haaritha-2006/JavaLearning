public class linearsearch{
    public static void main(String[]args){
        int arr[]={1,2,3,4,5};
        int key=3;
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println("element"+key+"is found at index"+i);
                found=true;
                break;
            }
        }
        if(found!=true){
            System.out.println("element not found");
        }
    }
}