import java.util.ArrayList;

public class GenericsOverallDemo {

    public static void main(String[] args) {

        // =====================================================
        // 1. WHY GENERICS? (Type Safety Problem without Generics)
        // =====================================================

        ArrayList list = new ArrayList(); // Raw type (NOT type safe)
        list.add(10);
        list.add("Hello"); // Different type allowed

        // int num = (int) list.get(1); // ClassCastException at runtime

        // =====================================================
        // 2. GENERICS WITH COLLECTIONS (TYPE SAFETY)
        // =====================================================

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        // numbers.add("Hello"); // Compile-time error (GOOD)

        int n = numbers.get(0); // No casting needed
        System.out.println("First number: " + n);

        // =====================================================
        // 3. GENERIC CLASS <T>
        // =====================================================

        Box<String> stringBox = new Box<>();
        stringBox.setValue("Java");
        System.out.println("String Box: " + stringBox.getValue());

        Box<Integer> intBox = new Box<>();
        intBox.setValue(100);
        System.out.println("Integer Box: " + intBox.getValue());

        // =====================================================
        // 4. GENERIC METHOD
        // =====================================================

        Integer[] intArr = {1, 2, 3};
        String[] strArr = {"A", "B", "C"};

        printArray(intArr);
        printArray(strArr);

        // =====================================================
        // 5. BOUNDED GENERICS (extends Number)
        // =====================================================

        System.out.println("Sum (int): " + addNumbers(10, 20));
        System.out.println("Sum (double): " + addNumbers(5.5, 4.5));

        // String not allowed because it does NOT extend Number
        // addNumbers("A", "B"); ❌
    }

    // ============================
    // GENERIC METHOD
    // ============================
    public static <T> void printArray(T[] arr) {
        for (T element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // ============================
    // BOUNDED GENERIC METHOD
    // ============================
    public static <T extends Number> double addNumbers(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }
}

// =================================
// GENERIC CLASS
// =================================
class Box<T> {

    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
