class examDetails{
    boolean isPass(int mark){
        if(mark>=40){
            return true;
        }
        else{
            return false;
        }
    }
}
public class param2{
    public static void main(String[]args){
        examDetails d=new examDetails();
        boolean res=d.isPass(60);
        System.out.println(res);
    }
}
