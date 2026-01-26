//      Values()  METHOD

public class EnumValuesDemo {

    enum Day {
        MONDAY, TUESDAY, WEDNESDAY
    }

    public static void main(String[] args) {

        // Loop through all enum constants
        for(Day d : Day.values()) {
            System.out.println(d);
        }
    }
}
