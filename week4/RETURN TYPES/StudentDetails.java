class Student{
    int roll;
    String name;
    int mark;
    Student(int r,String n,int m){
        roll=r;
        name=n;
        mark=m;
    }
    void updateName(String newName){
    this.name=newName;
}

}
public class StudentDetails{
    public static void main(String[] args) {
        Student s1=new Student(1,"ravi",57);
        Student s2=new Student(2, "karan", 98);
        System.out.println(s1.mark);
        System.out.println(s2.name);
        
        s1.updateName("rahul");
        System.out.println(s1.name);
    }
}
