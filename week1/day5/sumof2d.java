// import java.util.*;
// public class sumof2d {
//     public static void main(String[] args) {
//         Scanner s=new Scanner(System.in);
//         int r=s.nextInt();
//         int c=s.nextInt();
//         int [][]arr=new int[r][c];
//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 arr[i][j]=s.nextInt();
//             }
//         }
//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }
//         int sum=0;
//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 sum+=arr[i][j];
//             }
//         }
//         System.out.println(sum);
//         s.close();
//     }
// }

//------------------row-sum---------------------------------//
// import java.util.*;
// public class sumof2d {
//     public static void main(String[] args) {
//         Scanner s=new Scanner(System.in);
//         int r=s.nextInt();
//         int c=s.nextInt();
//         int [][]arr=new int[r][c];
//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 arr[i][j]=s.nextInt();
//             }
//         }
//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }
//         for(int i=0;i<r;i++){
//             int row_sum=0;
//             for(int j=0;j<c;j++){
//                 row_sum+=arr[i][j];
//             }
//              System.out.println(row_sum);
 
//         }
//               s.close();
//     }
// }

//--------------------column-sum--------------------//
import java.util.*;
public class sumof2d {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int r=s.nextInt();
        int c=s.nextInt();
        int [][]arr=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        for(int j=0;j<c;j++){
            int col_sum=0;
            for(int i=0;i<r;i++){
                col_sum+=arr[i][j];
            }
             System.out.println(col_sum);
 
        }
              s.close();
    }
}



