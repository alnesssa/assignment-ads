import java.util.Scanner;
public class task5 {
    /**
     * This method runs Task 5, which calculates the nth Fibonacci number.
     *
     * It prompts the user to enter a number and computes the corresponding Fibonacci number
     * using a recursive function.
     *
     * @param sc The Scanner object for user input.
     */
    public static void run(Scanner sc) {
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci number: " + fibonacci(n));
    }
    /**
     * This method calculates the nth Fibonacci number using recursion.
     *
     * The Fibonacci sequence is defined as:
     * - F(0) = 0
     * - F(1) = 1
     * - F(n) = F(n-1) + F(n-2) for n ≥ 2
     *
     * Time complexity: O(2^n), where n is the input number.
     * The function makes two recursive calls for each n, leading to exponential growth.
     *
     * Space complexity: O(n) due to recursive function calls stored in the call stack.
     *
     * @param n The position in the Fibonacci sequence.
     * @return The nth Fibonacci number.
     */
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
