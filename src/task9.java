import java.util.Scanner;
public class task9 {
    /**
     * This method runs Task 9, which calculates the binomial coefficient C(n, k).
     *
     * The binomial coefficient represents the number of ways to choose `k` elements
     * from a set of `n` elements without considering order.
     *
     * It prompts the user to enter values for `n` and `k`, then computes the binomial
     * coefficient using recursion.
     *
     * @param sc The Scanner object for user input.
     */
    public static void run(Scanner sc) {
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        System.out.println("C(" + n + ", " + k + ") = " + binomialCoeff(n, k));
    }
    /**
     * This method calculates the binomial coefficient C(n, k) using recursion.
     *
     * The binomial coefficient is defined as:
     * - C(n, 0) = C(n, n) = 1 (Base cases)
     * - C(n, k) = C(n-1, k-1) + C(n-1, k) (Recursive case)
     *
     * Time complexity: O(2^n), where n is the input value.
     * The function makes two recursive calls per step, leading to exponential growth.
     *
     * Space complexity: O(n) due to recursive function calls stored in the call stack.
     *
     * @param n The total number of elements.
     * @param k The number of elements to choose.
     * @return The binomial coefficient C(n, k).
     */
    public static int binomialCoeff(int n, int k) {
        if (k == 0 || k == n) return 1;
        return binomialCoeff(n - 1, k - 1) + binomialCoeff(n - 1, k);
    }
}
