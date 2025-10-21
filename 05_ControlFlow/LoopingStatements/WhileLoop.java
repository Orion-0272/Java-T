/*
While Loop Syntax:
<iterator-initialization>

while (<condition>) {
    // Block of code to execute.

    <update iterator>
}
*/


package LoopingStatements;

public class WhileLoop {
    public static void main(String[] args) {
        int iterator = 0;
        while (iterator <= 20) {
            System.out.println(iterator);
            iterator++;
        }
    }
}
