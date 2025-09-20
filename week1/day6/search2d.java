import java.util.*;

public class search2d {
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
        int key=s.nextInt();
        boolean found=false;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i][j]==key){
                    found=true;
                    System.out.printf("element found at position(%d,%d)",i,j);
                }
            }
            if(found==true){
            break;
        }
        }
        if(!found){
            System.out.println("element not found");
        }
     s.close();   
    }
}

