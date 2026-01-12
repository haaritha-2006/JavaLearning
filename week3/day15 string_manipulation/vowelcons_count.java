public class vowelcons_count {
    public static void main(String[] args) {
        String name="Programming";
        int vowel=0;
        int consonant=0;
        name=name.toLowerCase();
        for(int i=0;i<name.length();i++){
            char c=name.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                vowel++;
            }
            else if (c>='a' && c<='z'){
                consonant++;
            }
        }
        System.out.println("count_vowel:"+vowel);
        System.out.println("count_consonant:"+consonant);
    }
}
