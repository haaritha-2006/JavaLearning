public class factfunc {
    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
        fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        int res=factorial(5);
        System.out.println(res);
    }
}
