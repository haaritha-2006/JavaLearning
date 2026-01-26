import java.util.ArrayList;
import java.util.HashSet;

public class UniqueNamesDemo {
    public static void main(String[] args) {

        // Input list (may contain duplicates)
        ArrayList<String> names = new ArrayList<>();
        names.add("Ram");
        names.add("Sam");
        names.add("Ram");
        names.add("John");
        names.add("Sam");

        // HashSet to store unique names
        HashSet<String> uniqueNames = new HashSet<>();

        // Transfer elements from list to set
        for (String name : names) {
            uniqueNames.add(name); // duplicates ignored
        }

        // Display unique names
        for (String name : uniqueNames) {
            System.out.println(name);
        }
    }
}
