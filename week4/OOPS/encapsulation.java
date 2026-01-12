class Encapsulation {
    private String name;
    private int age;

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0) { // simple validation
            this.age = age;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Encapsulation s = new Student();
        s.setName("Arun");
        s.setAge(21);

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}
