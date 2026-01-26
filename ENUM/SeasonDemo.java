// ENUM OUTSIDE CLASS=GLOBAL USAGE BY MANY CLASSES

enum Season {
    WINTER, SPRING, SUMMER, FALL
}
public class SeasonDemo {
    public static void main(String[] args) {

        // Step 1: Choose a season (hardcoded for now)
        Season current = Season.SUMMER;

        // Step 2: Switch-case to print message
        switch(current) {
            case WINTER:
                System.out.println("Time for warm clothes!");
                break;
            case SPRING:
                System.out.println("Flowers are blooming!");
                break;
            case SUMMER:
                System.out.println("Time to hit the beach!");
                break;
            case FALL:
                System.out.println("Leaves are falling!");
                break;
        }
    }
}
