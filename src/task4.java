import java.util.Scanner;
public class task4 {
    /**
     * This method runs Task 4, which calculates the factorial of a given number.
     *
     * It prompts the user to enter a number and then computes its factorial
     * using a recursive function.
     *
     * @param sc The Scanner object for user input.
     */
    public static void run(Scanner sc) {
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Factorial: " + factorial(n));
    }
    /**
     * This method calculates the factorial of a given number using recursion.
     *
     * Factorial is calculated as: n! = n * (n - 1) * ... * 1
     * Base cases: 0! = 1 and 1! = 1
     *
     * Time complexity: O(n), where n is the input number.
     * The function calls itself recursively n times, resulting in linear time complexity.
     *
     * @param n The number for which the factorial is to be calculated.
     * @return The factorial of the given number.
     */
    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }
}

