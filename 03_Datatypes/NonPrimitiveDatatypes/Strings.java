/*
Strings:
Strings are sequence of characters. Understand like them as any text.
They are written inside double inverted comma("").
Although the string seems to be primitive datatype, but it is actually a class in java.lang package.

We can create string using three keywords:
1. String:
    Immutable,
    Thread-safe,
    Slow for repeated modification,
    Suitable where the string is constant.

2. StringBuffer:
    Mutable,
    Thread-safe (Synchronized)
    Slow as compared to StringBuilder,
    Suitable where multiple threads are accessing and modifying the string.

3. StringBuilder
    Mutable,
    Not thread-safe,
    Fastest
    Suitable where single thread is accessing and modifying the string.
*/

package NonPrimitiveDatatypes;

public class Strings {
    public static void main(String[] args) {
        // String build using String class.
        String text1 = "Hello1";
        System.out.println(text1);

        // String build using StringBuffer class.
        StringBuffer text2 = new StringBuffer("Hello2");
        System.out.println(text2);

        // String build using StringBuilder class.
        StringBuilder text3 = new StringBuilder("Hello3");
        System.out.println(text3);

        // We can check for text1 characters same as text2 by using .equals().
        if (text1.equals("Hello1")) {
            System.out.println("Text 1 and Text 2 are both equal");
        }
        else {
            System.out.println("Text 1 and Text 2 are not equal");
        }
    }

}
