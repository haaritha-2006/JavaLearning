public class secondlargest {
    public static int seclar(int arr[]){
        int largest=Integer.MIN_VALUE;
        int secondlar=Integer.MIN_VALUE;
        for(int num:arr){
            if(num>largest){
                secondlar=largest;
                largest=num;
            }
            if(num>secondlar && num!=largest){
                secondlar=num;
            }
        }
        return secondlar;
    }
    public static void main(String[] args) {
        int arr[]={12,45,67,89,100,23};
        int result=seclar(arr);
        System.out.println(result);
    }
}
