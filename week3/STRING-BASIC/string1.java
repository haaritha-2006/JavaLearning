public class string1 {
    public static void main(String[] args) {
        String s = "Programming";
        // length of str
        System.out.println(s.length());
        // from start to end
        System.out.println(s.substring(3, 6));
        // character at an index
        System.out.println(s.charAt(s.length() - 1));
        System.out.println(s.charAt(0));
        ///// CHECK EQUALITY
        String e1 = "hello";
        String e2 = "Hello";
        System.out.println(e1.equals(e2));
        ///// COMPARE
        String c1 = "abc";
        String c2 = "abc";
        System.out.println(c1.compareTo("abd")); // -1
        System.out.println(c2.compareTo("abc")); // 0
        System.out.println("abc".compareTo("abc")); // 0
        ///// CHARACTER TO ARRAY
        // Variable Type Purpose
        // a String Holds the original string "Haaritha"
        // arr char[] Holds the string as an array of characters
        // c char (loop) Holds one character at a time during the loop
        // /////
        String a = "Haaritha";
        char[] arr = a.toCharArray();
        for (char c : arr) {
            System.out.println(c);
        }

        ////ARRAY TO STRING
        char []b={'j','a','v','a'};
        String str=new String(b);
        System.out.println(str);
    }
}