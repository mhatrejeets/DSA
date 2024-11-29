import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();

            int square = number * number;
            System.out.println("Square of the number: " + square);

        } catch (Exception e) {
            System.out.println("Invalid input or error occurred. Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }
}
