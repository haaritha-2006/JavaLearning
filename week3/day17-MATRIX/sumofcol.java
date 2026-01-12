package day17;

public class sumofcol {
    public static void main(String[] args) {
        int A[][]={{1,2},{2,3}};
        for(int j=0;j<A[0].length;j++){
            int sum=0;
            for(int i=0;i<.length;i++){
                sum+=A[i][j];
            }
            System.out.println(sum);
        }
    }
}


