import java.util.Scanner;
public class task7 {
    /**
     * This method runs Task 7, which prints a sequence of numbers in reverse order.
     *
     * It prompts the user to enter a number of elements, then reads and
     * prints them in reverse order using recursion.
     *
     * @param sc The Scanner object for user input.
     */
    public static void run(Scanner sc){
        System.out.print("Number: ");
        int n = sc.nextInt();
        System.out.println("Enter numbers:");
        reverse(n, sc);
    }
    /**
     * This method prints numbers in reverse order using recursion.
     *
     * It reads an integer, recursively processes the rest, and prints
     * the current number after returning from recursion.
     *
     * Time complexity: O(n), where n is the number of elements.
     * The function makes n recursive calls, each processing one element.
     *
     * @param n The number of elements to read and reverse.
     * @param sc The Scanner object for reading input.
     */
    public static void reverse(int n, Scanner sc) {
        if (n == 0) return;
        int num = sc.nextInt();
        reverse(n - 1, sc);
        System.out.print(num + " ");
    }
}

