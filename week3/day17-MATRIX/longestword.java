public class longestword {
    public static void main(String[] args) {
        String[] words = { "java", "haaritha", "programming" };
        String longest = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length()> longest.length()) {
                longest = words[i];
            }
        }
        System.out.println(longest);
    }
}
