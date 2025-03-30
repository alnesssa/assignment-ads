import java.util.ArrayList;
import java.util.Scanner;
public class task1 {
    /**
     * This method runs Task 1, which finds the minimum value in a list of numbers.
     *
     * It prompts the user to enter a number of integers, stores them in an ArrayList,
     * and determines the smallest value in the list.
     *
     * @param sc The Scanner object for user input.
     */
    public static void run(Scanner sc) {
        System.out.println("Number: ");
        int n = sc.nextInt();
        ArrayList<Integer> num = new ArrayList<>();
        System.out.println("Enter numbers:");
        for (int i = 0; i < n; i++) {
            num.add(sc.nextInt());
        }
        int min = minOfArray(num);
        System.out.println("Min: " + min);
    }
    /**
     * This method finds the minimum value in an ArrayList of integers.
     *
     * It iterates through the list and updates the minimum value whenever
     * a smaller number is found.
     *
     * Time complexity: O(n), where n is the number of elements in the list.
     * The method performs a single pass through the list, making it a linear-time operation.
     *
     * @param num The list of integers.
     * @return The minimum value found in the list.
     */
    public static int minOfArray(ArrayList<Integer> num) {
        int min = num.get(0);
        for (int i = 1; i < num.size(); i++) {
            if (num.get(i) < min) {
                min = num.get(i);
            }
        }
        return min;
    }
}