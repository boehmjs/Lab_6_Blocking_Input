import java.util.InputMismatchException;
import java.util.Scanner;

class RectangleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = getValidDoubleInput(scanner, "Enter the width of the rectangle: ");
        double height = getValidDoubleInput(scanner, "Enter the height of the rectangle: ");

        double area = width * height;
        double perimeter = 2 * (width + height);

        System.out.println("\n--- Rectangle Details ---");
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);

        scanner.close();
    }

    /**
     * Prompts the user for a double input and loops until a valid positive double is entered.
     *
     * @param scanner The Scanner object to read input from.
     * @param prompt  The message to display to the user.
     * @return A valid positive double value.
     */
    private static double getValidDoubleInput(Scanner scanner, String prompt) {
        double value = 0;
        boolean isValid = false;

        while (!isValid) {
            System.out.print(prompt);
            try {
                value = scanner.nextDouble();
                if (value > 0) {
                    isValid = true;
                } else {
                    System.out.println("Input must be a positive number. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a numerical value.");
                scanner.next(); // Consume the invalid input
            }
        }
        return value;
    }
}
