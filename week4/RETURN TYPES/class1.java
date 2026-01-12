import java.util.*;
class Student{
    int roll;
    String name;
    int mark;
}
class Main{
    public static void main(String[] args) {
        Student s1=new Student();
        s1.roll=1;
        s1.name="Ravi";
        s1.mark= 70;
        Student s2=new Student();
        s2.roll=2;
        s2.name="kiran";
        s2.mark=90;
        System.out.println(s2.name);
        System.out.println(s1.mark);
        
    }
}