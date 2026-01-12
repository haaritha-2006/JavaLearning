public class Stringsusage {

//1️⃣ trim() — REMOVE EXTRA SPACES

    String name = "   Java Dev   ";
    name = name.trim();
    System.out.println(name);

//2️⃣ contains() — CHECK IF TEXT EXISTS

String email = "user@gmail.com";

if(email.contains("@")) {
    System.out.println("Valid email");
}

//3️⃣ split() — BREAK STRING INTO PARTS

String data = "Java,Python,C++";
String[] arr = data.split(",");

for(String lang : arr) {
    System.out.println(lang);
}

//4️⃣ replace() — CHANGE TEXT

String msg = "I love Java";
msg = msg.replace("Java", "Python");

System.out.println(msg);

//5️⃣ substring() — EXTRACT PART

String s = "Programming";
System.out.println(s.substring(0, 7));

}