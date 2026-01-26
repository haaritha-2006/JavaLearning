import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

        names.add("Ram");
        names.add("Ahaan");
        names.add("Tej");

        Iterator<String> it = names.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
            if(s.equals("Ahaan")) {
            it.remove();   // ✅ safe removal
        }

    }
}
