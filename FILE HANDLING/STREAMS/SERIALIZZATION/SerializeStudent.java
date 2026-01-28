import java.io.*;

class Student implements Serializable {
    int id;
    String name;
    transient int pin;

    Student(int id, String name, int pin) {
        this.id = id;
        this.name = name;
        this.pin = pin;
    }
}

public class SerializeStudent {
    public static void main(String[] args) {

        Student s1 = new Student(1, "Arun", 1234);

        try {
            ObjectOutputStream oos =
                new ObjectOutputStream(
                    new FileOutputStream("student.txt")
                );

            oos.writeObject(s1);
            oos.close();

            System.out.println("Student object serialized");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
