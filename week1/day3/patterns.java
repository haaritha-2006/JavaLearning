import java.util.Scanner;

public class patterns {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        //1// for(int i=1;i<=n;i++){
        //     for(int j=1;j<i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }
        //2// for(int i=n;i>0;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //    }
        //     System.out.println("");

        //     }
        //3// for(int i=0;i<n;i++){
        //      for(int j=1;j<=n-i;j++){
        //          System.out.print(" ");
        //     }
        //     for(int k=1;k<i;k++){
        //         System.out.print("*");

        //     }
        //      System.out.println("");

        //      }
        //4// int m=s.nextInt();
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        //5// int m=s.nextInt();
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         if(i==0||i==n-1||j==0||j==m-1){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }
        // for(int i=1;i<=n;i++){
        //     for(int k=1;k<=n-i;k++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=(2*i-1);j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
         for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                if (j == 1 || j == (2 * i - 1) || i == n) {
            System.out.print("*");
        } else {
            System.out.print(" ");
        }
            }
            System.out.println();
        }
    }
}
