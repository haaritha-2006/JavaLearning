import java.util.*;
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> names=new LinkedList<>();

        //ADD NAMES
        names.add("Ram");
        names.add("Ahaan");

        //ADD FIRST/LAST
        names.addFirst("Tej");
        names.addLast("vihaan");

        System.out.println(names);

        //REMOVE
        names.remove(1);

        //PRINT
        System.out.println(names);


    }
}

/* OUTPUT

[Tej, Ram, Ahaan, vihaan]
[Tej, Ahaan, vihaan]

*/