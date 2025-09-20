public class sumofd {
    public static int sd(int n){
        if(n==0){
            return 0;
        }
        else{
        int digit=n%10;
        return digit+sd(n/10);
        }
    }
    public static void main(String[] args) {
        System.out.println(sd(1234));
    }
}
