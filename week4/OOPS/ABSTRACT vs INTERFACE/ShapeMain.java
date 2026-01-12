/*
 Interface (Rule)

Imagine you and your friends must wear a school uniform.

How each friend styles their hair or shoes can differ → that’s allowed.

Rule = uniform, implementation = hair/shoes → Interface
*/


//Shape Calculator – Interface

interface Shape {
    void area();
    // rule: every shape must implement
}

//circle class
class Circle implements Shape{
    void area(){
        System.out.println("area of circle:pi*R*R");
    }
}

//rectangle class
class Rectangle implements Shape{
    void area(){
        System.out.println("area of rectangle:length*breadth");
    }
}

// Main class
public class ShapeMain {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.area(); // Circle area
        r.area(); // Rectangle area
    }
}