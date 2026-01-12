package day17;
import java.util.Scanner;

public class matrixmul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input rows and columns
        System.out.print("Enter rows and columns of Matrix A: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        System.out.print("Enter rows and columns of Matrix B: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        // Step 2: Check if multiplication is possible
        if(c1!=r2){
            System.out.println("Matrix multiplication not possible!");
            return;
        }
        // Step 3: Declare matrices
        int[][] A = new int[r1][c1];
        int[][] B = new int[r2][c2];
        int[][] C = new int[r1][c2];

        // Step 4: Input Matrix A
        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // Step 5: Input Matrix B
        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                B[i][j] = sc.nextInt();
            }
        }

         // Step 6: Multiply matrices
         for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                C[i][j]=0;
                for(int k=0;k<c1;k++){
                    C[i][j]+=A[i][k]*B[k][j];
                }
            }
         }
        // Step 7: Print Result
        System.out.println("Product Matrix:");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
    }
}
