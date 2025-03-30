import java.util.ArrayList;
import java.util.Scanner;
public class task2 {
    /**
     * This method runs Task 2, which calculates the average of a list of numbers.
     *
     * It prompts the user to enter a number of integers, stores them in an ArrayList,
     * and computes the average value.
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
        double average = averageOfArray(num);
        System.out.println("Average: " + average);
    }
    /**
     * This method calculates the average of an ArrayList of integers.
     *
     * It iterates through the list, computes the sum of all elements,
     * and divides it by the total number of elements to get the average.
     *
     * Time complexity: O(n), where n is the number of elements in the list.
     * The method performs a single pass through the list, making it a linear-time operation.
     *
     * @param num The list of integers.
     * @return The average value of the numbers in the list.
     */
    public static double averageOfArray(ArrayList<Integer> num) {
        int sum = 0;
        for (int number : num) {
            sum += number;
        }
        return (double) sum / num.size();
    }
}