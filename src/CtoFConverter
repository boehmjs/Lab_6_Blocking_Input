
    import java.util.InputMismatchException;
import java.util.Scanner;

    class CelsiusToFahrenheitConverter {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double celsius = 0;
            boolean validInput = false;

            while (!validInput) {
                System.out.print("Enter temperature in Celsius: ");
                try {
                    celsius = scanner.nextDouble();
                    validInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a numeric value for temperature.");
                    scanner.next();
                }
            }

            double fahrenheit = (celsius * 9 / 5) + 32;

            System.out.printf("The equivalent temperature in Fahrenheit is: %.2f%n", fahrenheit);

            scanner.close();
        }
    }

