import java.util.*;

public class task2diag {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int r=s.nextInt();
        int c=s.nextInt();
        int [][] arr=new int[r][c];
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
        if(r==c){
            int mainsum=0;
            int secsum=0;
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    if(i==j){
                        mainsum+=arr[i][j];
                    }
                    if(i+j==r-1){
                        secsum+=arr[i][j];
                    }
                }
            }
            System.out.println("main sum:"+mainsum);
                System.out.println("secsum:"+secsum);
        }
    }
}
