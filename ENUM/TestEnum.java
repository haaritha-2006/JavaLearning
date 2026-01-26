// ENUM INSIDE CLASS=USED BY A SPECIFIC CLASS

public class TestEnum {

    enum Day {
        MONDAY, TUESDAY, WEDNESDAY
    }

    public static void main(String[] args) {

        Day today = Day.MONDAY;

        System.out.println(today);
    }
}
