// MATRIX MULTIPLICATION
// CREATE 2 2D ARR A AND B 
// RESULT C 
// A X B = cWHERE A=r1xc1
// B=r2xc2
// c=c1xr2

import java.util.*;
public class matrixmul {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int r1 = s.nextInt();
        int c1 = s.nextInt();
        int[][] A = new int[r1][c1];

        int r2 = s.nextInt();
        int c2 = s.nextInt();
        int[][] B = new int[r2][c2];

        // A input
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                A[i][j] = s.nextInt();
            }
        }

        // B input
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                B[i][j] = s.nextInt();
            }
        }

        if (c1 == r2) {
            int[][] C = new int[r1][c2];

            // multiplication logic
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    C[i][j] = 0;
                    for (int k = 0; k < c1; k++) {
                        C[i][j] += A[i][k] * B[k][j];
                    }
                }
            }

            // print result
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.print(C[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("not possible");
        }
        s.close();
    }
}
