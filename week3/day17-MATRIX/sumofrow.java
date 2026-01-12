public class sumofrow {
    public static void main(String[] args) {
        int A[][]={{1,2},{2,3}};
        for(int i=0;i<A.length;i++){
            int sum=0;
            for(int j=0;j<A[i].length;j++){
                sum+=A[i][j];
            }
            System.out.println(sum);
        }
    }
}
