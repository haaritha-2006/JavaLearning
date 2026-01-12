class Calculator {

    int sumOfSquares(int a, int b)
{
        return a*a+b*b;
    }
    boolean isBetween(int n, int low, int high){
    return n >= low && n <= high;
}
}

public class dsa1{
    public static void main(String[] args) {
        Calculator c2=new Calculator();
        int res=c2.sumOfSquares(3, 9);
        System.out.println(res);
        boolean res2=c2.isBetween(4, 3,8);
        System.out.println(res2);
    }
}
