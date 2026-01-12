class Student1{
    int roll;
    String name;
    int mark;
    Student1(int r, String n, int m) {
        roll = r;
        name = n;
        mark = m;
    }
    String getName(){
        return name;
    }

}
public class returntypes {
    public static void main(String[] args) {
        Student1 s1=new Student1(1,"ravi",30);
        
        String a=s1.getName();
        System.out.println(a);
    }
}
