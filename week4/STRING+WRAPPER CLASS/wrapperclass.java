public class wrapperclass {
    public static void main(String[] args) {

/*What is Autoboxing?
Java automatically converts:    primitive → wrapper
*/
        int x = 10;        // primitive
        Integer y = 10;   // wrapper (object)


/* UNBOXING?
Java converts:    wrapper → primitive
 */

Integer x = 10;
int y = x;   // automatic

/*STRING → NUMBER (MOST IMPORTANT USE ❗) */
        String age = "20";
        int a = Integer.parseInt(age);
        System.out.println(a + 5);

    }
}
