abstract class Animal {

    abstract void sound();   // no body
}
class Dog extends Animal {

    void sound() {
        System.out.println("Dog barks");
    }
}
public class abstract_class {
    public static void main(String[] args) {

        Animal a = new Dog();
        a.sound();
    }
}

/*      Animal a = new Animal(); // ❌ ERROR
*/