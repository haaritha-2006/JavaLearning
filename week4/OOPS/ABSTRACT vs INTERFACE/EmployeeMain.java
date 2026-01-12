/*
2️⃣ Abstract Class (Partial Blueprint)

Imagine you are organizing a bake sale:

All cakes must have flour + sugar (common)

But frosting & decoration differs per cake → that’s left to child (abstract method)
*/
// ABSTRACT CLASS
abstract class Employee{
        String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void showInfo() { // common method
        System.out.println(name + " earns " + salary);
    }

    abstract void calculateTax(); // differs per employee

}

//INHERIT MANAGER CLASS
class Manager extends Employee {
    Manager(String name, double salary) {
        super(name, salary);//INHERIT FROM Employee
    }

    void calculateTax() {
        System.out.println(name + " (Manager) tax: " + (salary * 0.3));
    }
}

//INHERIT DEVELOPER CLASS
class Developer extends Employee {
    Developer(String name, double salary) {
        super(name, salary);//INHERIT FROM Employee
    }

    void calculateTax() {
        System.out.println(name + " (Developer) tax: " + (salary * 0.2));
    }
}

//MAIN CLASS
public class EmployeeMain {
    public static void main(String[] args) {
        Manager m = new Manager("Alice", 100000);
        Developer d = new Developer("Bob", 80000);

        m.showInfo();
        m.calculateTax();

        d.showInfo();
        d.calculateTax();
    }
}