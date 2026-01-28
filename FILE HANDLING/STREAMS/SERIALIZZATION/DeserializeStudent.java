import java.io.*;

public class DeserializeStudent {
    public static void main(String[] args) {

        try {
            ObjectInputStream ois =
                new ObjectInputStream(
                    new FileInputStream("student.txt")
                );

            Student s = (Student) ois.readObject();
            ois.close();

            System.out.println(s.id);
            System.out.println(s.name);
            System.out.println(s.pin);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
