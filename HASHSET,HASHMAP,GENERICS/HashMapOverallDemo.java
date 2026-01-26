import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapOverallDemo {

    public static void main(String[] args) {

        // 1. Creating HashMap (key-value pair)
        HashMap<Integer, String> map = new HashMap<>();

        // 2. Adding elements using put()
        map.put(101, "John");
        map.put(102, "Alice");
        map.put(103, "Bob");

        // Duplicate key → value will be replaced
        map.put(102, "Alex");

        System.out.println("HashMap after adding elements: " + map);

        // 3. Access value using key
        System.out.println("Value for key 101: " + map.get(101));

        // 4. Check if key exists
        System.out.println("Contains key 103? " + map.containsKey(103));

        // 5. Check if value exists
        System.out.println("Contains value 'Bob'? " + map.containsValue("Bob"));

        // 6. Remove entry
        map.remove(101);
        System.out.println("After removing key 101: " + map);

        // 7. Iterating using keySet()
        System.out.println("\nIterating using keySet():");
        for (Integer key : map.keySet()) {
            System.out.println(key + " → " + map.get(key));
        }

        // 8. Iterating using entrySet() (BEST PRACTICE)
        System.out.println("\nIterating using entrySet():");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        // 9. Size of HashMap
        System.out.println("\nSize of HashMap: " + map.size());

        // 10. HashMap with custom objects as values
        HashMap<Integer, Student> studentMap = new HashMap<>();

        studentMap.put(1, new Student(1, "Rahul"));
        studentMap.put(2, new Student(2, "Sneha"));

        System.out.println("\nStudent HashMap:");
        for (Integer key : studentMap.keySet()) {
            Student s = studentMap.get(key);
            System.out.println(key + " → " + s.id + " " + s.name);
        }
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
}
