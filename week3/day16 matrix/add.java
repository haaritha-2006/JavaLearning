import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int r=s.nextInt();
        int c=s.nextInt();
        int [][]sum=new int[r][c];
        int [][]A=new int[r][c];
        int [][]B=new int[r][c];
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
        // FOR B MATRIX
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                B[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(B[i][j]+" ");
            }
            System.out.println();
        }
        // FOR SUM MATRIX
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                sum[i][j]=A[i][j]+B[i][j];
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
        //DIFFERENCE
        int diff[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                diff[i][j]=A[i][j]-B[i][j];
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(diff[i][j]+" ");
            }
            System.out.println();
        }
    }
}
