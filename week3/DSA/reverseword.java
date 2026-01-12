package day18;

public class reverseword {
    public static void main(String[] args) {
        String sentence = "hello welcome to java";
        String[] words = sentence.split(" ");//SPLIT WHEN IT HAS GAP BETWEEN WORDS
        String result = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String rev = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                rev += charAt(j);
            }
            result += rev + " ";
        }
        System.out.println(result.trim());//TRIM EXTRA WHITESPACE AT END
    }
}
