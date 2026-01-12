import java.util.Scanner;

class ThrowExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        // Throwing exception manually
        if(age < 18){
            throw new IllegalArgumentException("Age must be 18 or above!");
        }

        System.out.println("Eligible to vote");
        sc.close();
    }
}

