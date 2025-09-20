public class patrec {
    public static void printstars(int n){
        if(n==0){
            return ;
        }
        else{
            printstars(n-1);
            for(int i=0;i<n;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        printstars(5);
    }
}
