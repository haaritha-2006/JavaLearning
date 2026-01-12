package day18;

public class count_frequency {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 2, 4, 3, 2 };
        boolean[] counted = new boolean[arr.length]; // default false

        for (int i = 0; i < arr.length; i++) {
            if (counted[i])
                continue; // already counted, skip

            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    counted[j] = true; // mark as counted
                }
            }

            System.out.println(arr[i] + " occurs " + count + " times");
        }
    }

}
