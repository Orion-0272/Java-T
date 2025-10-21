/*
Working:
The working of do-while loop is a little different. In this, the condition is checked after the code has been executed, this makes

Do-while Loop Syntax:
<iterator-initialization>

do {
    // Block of code to execute.

    <update iterator>
} (<condition>)
*/

package LoopingStatements;

public class DoWhileLoop {
    public static void main(String[] args) {
        int iterator = 0;
        do {
            System.out.println(iterator);
            iterator++;
        } while (iterator <= 20);
    }
}
