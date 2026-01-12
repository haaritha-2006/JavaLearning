package day16 matrix;
import java.util.Scanner;
public class matrix_full {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int r=s.nextInt();
        int c=s.nextInt();
        int [][]A=new int[r][c];
        int [][]B=new int[r][c];
        int [][]sum=new int[r][c];
        int diff[][]=new int[r][c];
        int trace_A=0;
        int trace_B=0;
        //FOR A MATRIX
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                A[i][j]=s.nextInt();
            }
        }
System.out.println("Matrix A:");
printMatrix(A, r, c);
        // FOR B MATRIX
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                B[i][j]=s.nextInt();
            }
        }
        System.out.println("Matrix B:");
printMatrix(B, r, c);

        // FOR SUM MATRIX
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                sum[i][j]=A[i][j]+B[i][j];
            }
        }
System.out.println("sum:");
printMatrix(sum, r, c);

        //DIFFERENCE
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                diff[i][j]=A[i][j]-B[i][j];
            }
        }
System.out.println("Difference:");
printMatrix(diff, r, c);
        //TRACE IF R==C ONLY POSSIBLE
        if(r==c){
            for(int i=0;i<r;i++){
            trace_A+=A[i][i];
        }
            for(int i=0;i<r;i++){
            trace_B+=B[i][i];
        }
        System.out.println("trace of A:"+trace_A);
        System.out.println("trace of B:"+trace_B);       
        }
        else{
            System.out.println("Trace not possible");
        }
    }
    public static void printMatrix(int[][] M, int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }
    }
}
