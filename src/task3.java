import java.util.Scanner;
public class task3 {
    /**
     * This method runs Task 3, which checks if a given number is prime.
     *
     * It prompts the user to enter a number and determines whether the number
     * is prime or composite using a recursive function.
     *
     * @param sc The Scanner object for user input.
     */
    public static void run(Scanner sc) {
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n <= 1) {
            System.out.println("Composite");
        } else {
            System.out.println(prime(n, 2) ? "Prime" : "Composite");
        }
    }
    /**
     * This method checks if a number is prime using recursion.
     *
     * The method starts dividing the number `n` from 2 and checks for divisibility.
     * If a divisor is found, the number is composite; otherwise, it is prime.
     *
     * Time complexity: O(√n), where n is the input number.
     * The function only checks divisibility up to sqrt(n), making it more efficient.
     *
     * @param n The number to check for primality.
     * @param i The current divisor being tested.
     * @return `true` if the number is prime, `false` if it is composite.
     */
    public static boolean prime(int n, int i) {
        if (i * i > n) return true;
        if (n % i == 0) return false;
        return prime(n, i + 1);
    }
}
