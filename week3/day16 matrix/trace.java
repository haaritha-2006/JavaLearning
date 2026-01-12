import java.util.Scanner;

public class trace {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int r=s.nextInt();
        int c=r;
        int [][]A=new int[r][c];
        //FOR A MATRIX
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                A[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
        //TRACE MEANS SUM OF ALL DIAGONAL ELEMENTS
        int trace=0;
        for(int i=0;i<r;i++){
            trace+=A[i][i];
        }
        System.out.println("trace of A:"+trace);
        
}
}
