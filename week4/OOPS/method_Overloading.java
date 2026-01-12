//Compile-time Polymorphism//
class method_Overloading {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
public class Main {
    public static void main(String[] args) {
        method_Overloading c = new method_Overloading();

        System.out.println(c.add(2, 3));       // calls add(int,int)
        System.out.println(c.add(2, 3, 4));    // calls add(int,int,int)
    }
}
