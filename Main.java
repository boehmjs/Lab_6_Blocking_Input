import java.util.Random;
import java.util.Scanner;

class GuessTheNumber {

    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1; // nextInt(10) gives 0-9, so add 1 for 1-10

        Scanner scanner = new Scanner(System.in);
        int userGuess;

        do {
            System.out.print("Guess a number between 1 and 10: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next();
                System.out.print("Guess a number between 1 and 10: ");
            }
            userGuess = scanner.nextInt();

            if (userGuess < 1 || userGuess > 10) {
                System.out.println("Your guess must be between 1 and 10. Please try again.");
            }
        } while (userGuess < 1 || userGuess > 10);

        System.out.println("The random number was: " + randomNumber);

        if (userGuess == randomNumber) {
            System.out.println("On the money! You guessed correctly!");
        } else if (userGuess < randomNumber) {
            System.out.println("Too low! Your guess was lower than the random number.");
        } else { // userGuess > randomNumber
            System.out.println("Too high! Your guess was higher than the random number.");
        }

        scanner.close();
    }
}