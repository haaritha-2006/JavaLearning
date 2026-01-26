import java.util.HashSet;
import java.util.Iterator;

public class HashSetOverallDemo {

    public static void main(String[] args) {

        // 1. Creating HashSet (stores UNIQUE elements, NO index, UNORDERED)
        HashSet<Integer> set = new HashSet<>();

        // 2. Adding elements
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20); // duplicate → ignored

        System.out.println("HashSet after adding elements: " + set);

        // 3. Check size
        System.out.println("Size of HashSet: " + set.size());

        // 4. Check if element exists
        System.out.println("Contains 20? " + set.contains(20));
        System.out.println("Contains 50? " + set.contains(50));

        // 5. Removing element
        set.remove(10);
        System.out.println("After removing 10: " + set);

        // 6. Iteration using for-each loop
        System.out.print("Iterating using for-each: ");
        for (int num : set) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 7. Iteration using Iterator
        System.out.print("Iterating using Iterator: ");
        Iterator<Integer> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        // 8. HashSet with custom objects (IMPORTANT CONCEPT)
        HashSet<Student> students = new HashSet<>();

        students.add(new Student(1, "John"));
        students.add(new Student(2, "Alice"));
        students.add(new Student(1, "John")); // duplicate logically

        System.out.println("\nStudents HashSet:");
        for (Student s : students) {
            System.out.println(s.id + " " + s.name);
        }

        // NOTE:
        // Without overriding equals() & hashCode(),
        // HashSet treats objects as different even if data is same.
    }
}

// Custom class
class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Uncomment to see correct duplicate removal
    /*
    @Override
    public boolean equals(Object o) {
        Student s = (Student) o;
        return this.id == s.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
    */
}
