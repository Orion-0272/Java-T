/*
Syntax:
try {
    //  Block of code to try
}
catch(Exception e) {
    //  Block of code to handle errors
}

finally {
    // Will always run no matter if error comes or not.
}
*/


public class TryCatchFinally {

    // The `throws` keyword says that this method might throw a particular error.
    public static void main() throws ArithmeticException{
        try {

            // The `throw` keyword is used to explicitly throw an error.
            throw new ArithmeticException("Throwing error");
        }
        catch (ArithmeticException error) {
            System.out.println("Error of arithmetic operation");
        }
        catch (Exception error) {
            System.out.println("Error: " + error);
        }
        finally {
            System.out.println("The execution of program is ended.");
        }
    }
}
