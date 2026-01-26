public class EnumSwitchDemo {

    enum Day { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY }

    public static void main(String[] args) {

        Day today = Day.WEDNESDAY;

        switch(today) {
            case MONDAY:
                System.out.println("Week start aagudhu!");
                break;
            case FRIDAY:
                System.out.println("Weekend almost varudhu!");
                break;
            default:
                System.out.println("Midweek work continues!");
        }
    }
}
