import java.util.Scanner;
public class task8 {
    /**
     * This method runs Task 8, which checks if a given string consists only of digits.
     *
     * It prompts the user to enter a string and determines whether all characters
     * in the string are digits using a recursive function.
     *
     * @param sc The Scanner object for user input.
     */
    public static void run(Scanner sc){
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        if (isAllDigits(s, 0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    /**
     * This method checks if all characters in a string are digits using recursion.
     *
     * The function iterates through the string one character at a time, verifying
     * if each character is a digit. If a non-digit character is found, it returns false.
     *
     * Time complexity: O(n), where n is the length of the string.
     * The function makes a recursive call for each character in the string.
     *
     * @param s The input string.
     * @param index The current character index being checked.
     * @return `true` if all characters are digits, `false` otherwise.
     */
    public static boolean isAllDigits(String s, int index) {
        if (index == s.length()) return true;
        if (!Character.isDigit(s.charAt(index))) return false;
        return isAllDigits(s, index + 1);
    }
}
