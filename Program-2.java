import java.util.Scanner;
public class Program_2 {
    public static void printOddSeries(int a, int current) {
        if (current > a) {
            return;
        }
        System.out.print((2 * current - 1));
        if (current < a) {
            System.out.print(", ");
        }
        printOddSeries(a, current + 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = scanner.nextInt();

        if (a <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            printOddSeries(a, 1);
        }
        scanner.close();
    }
}




