class Calculator {

    int sumThree(int x, int y, int z){
        int sum=x+y+z;
        return sum;
    }
    boolean isBetween(int n, int low, int high){
    if(n<=high && n>=low){
        return true;
    }
    else{
        return false;
    }
}

public class multiparam {
    public static void main(String[] args) {
        Calculator c2=new Calculator();
        int res=c2.sumThree(4, 6, 5);
        System.out.println(res);
        boolean res2=c2.isBetween(4, 3,8);
        System.out.println(res2);
    }
}
