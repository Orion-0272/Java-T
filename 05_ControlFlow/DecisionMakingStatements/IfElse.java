/*
Syntax:
if (condition 1) {
    // Block of code to execute when the condition 1 is true.
}

else if (condition 2)
    // Block of code to execute when the condition 2 is true.

else {
    // Block of code to execute when all condition are false.
}
*/

package DecisionMakingStatements;

public class IfElse {
    public static void main(String[] args) {
        int age = 25;

        if (age >= 20 && age <= 60) {
            System.out.println("You can drive.");
        }
        else if (age > 60) {
            System.out.println("You are too old to drive.");
        }
        else if (age < 20 && age > 0) {
            System.out.println("You are too young to drive.");
        }
        else {
            System.out.println("Please enter a valid age!");
        }
    }
}
