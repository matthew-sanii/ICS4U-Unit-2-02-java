/*
* The factorial program, that tell the factorial of the user's input
*
* @author  Matthew Sanii
* @version 1.0
* @since   2021-26-11
*/

import java.util.Scanner;

/**
* This is the factorial program.
*/
final class Factorial {

    /**
    * Prevent instantiation
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Factorial() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * Finds the factorial of input.
    *
    * @param input the user's input
    * @return the factorial
    */

    public static int factorial(int input) {
        final int value = input;
        int output = 0;
        if (value == 0) {
            output = 1;
        }
        else {
            output = factorial(value - 1) * value;
        }
        return output;
    }

    /**
    * The starting main() function.
    *
    * @param args Name of file containing a string of numbers
    */
    public static void main(final String[] args) {
        final Scanner decision = new Scanner(System.in);
        System.out.print("Input what you want to find the factorial of"
                                   + " (must be a whole, postive number): ");
        final String input = decision.nextLine();
        try {
            final int choice = Integer.valueOf(input);
            final int answer = factorial(choice);
            System.out.println("The factorial of " + choice + " equals "
                                                    + answer + ".");
        }
        catch (NumberFormatException errorCode) {
            System.out.println("Input isn't a positive, whole number.");
            System.exit(1);
        }
    }
}
