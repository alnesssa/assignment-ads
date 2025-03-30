import java.util.Scanner;
public class task10 {
    /**
     * This method runs Task 10, which calculates the Greatest Common Divisor (GCD) of two numbers.
     *
     * It prompts the user to enter two integers `a` and `b`, then computes their GCD
     * using the Euclidean algorithm.
     *
     * @param sc The Scanner object for user input.
     */
    public static void run(Scanner sc){
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.println("GCD(" + a + ", " + b + ") = " + gcd(a, b));
    }
    /**
     * This method calculates the Greatest Common Divisor (GCD) using the Euclidean algorithm.
     *
     * The Euclidean algorithm follows these rules:
     * - gcd(a, 0) = a (Base case)
     * - gcd(a, b) = gcd(b, a % b) (Recursive case)
     *
     * Time complexity: O(log(min(a, b))), where a and b are the input numbers.
     * The function repeatedly reduces the problem size by dividing `a` by `b`,
     * leading to logarithmic time complexity.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @return The greatest common divisor of `a` and `b`.
     */
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}

