import java.util.Scanner;
public class task6 {
    /**
     * This method runs Task 6, which calculates the power of a number (a^n).
     *
     * It prompts the user to enter a base number and an exponent,
     * then computes the result using recursion.
     *
     * @param sc The Scanner object for user input.
     */
    public static void run(Scanner sc) {
        System.out.print("Enter base (a): ");
        int a = sc.nextInt();
        System.out.print("Enter exponent (n): ");
        int n = sc.nextInt();
        System.out.println(power(a, n));
    }
    /**
     * This method calculates a^n using recursion.
     *
     * The power function follows this rule:
     * - a^0 = 1 (base case)
     * - a^n = a * a^(n-1) for n > 0 (recursive case)
     *
     * Time complexity: O(n), where n is the exponent.
     * The function recursively multiplies `a` by itself `n` times.
     *
     * @param a The base number.
     * @param n The exponent (must be non-negative).
     * @return The result of a^n.
     */
    public static int power(int a, int n) {
        if (n == 0) return 1;
        return a * power(a, n - 1);
    }
}
