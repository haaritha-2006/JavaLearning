class calculator{
    int square(int n){
        return n*n;
    }
}
public class param{
    public static void main(String[] args) {
        calculator c1=new calculator();
        int res=c1.square(4);
        System.out.println(res);
    }
}