import java.util.Scanner;
public class Main {
    /**
     * Main class for the program.
     * This program provides a menu-driven system where users can select different tasks.
     * The user inputs a choice, and the corresponding task is executed.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("\nEnter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> task1.run(sc);
                case 2 -> task2.run(sc);
                case 3 -> task3.run(sc);
                case 4 -> task4.run(sc);
                case 5 -> task5.run(sc);
                case 6 -> task6.run(sc);
                case 7 -> task7.run(sc);
                case 8 -> task8.run(sc);
                case 9 -> task9.run(sc);
                case 10 -> task10.run(sc);
            }
        }
    }
}
