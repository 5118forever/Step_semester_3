import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int secretNumber = 42;
        int attempts = 0;
        int guess;

        while (true) {

            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            attempts++;

            if (guess < secretNumber) {
                System.out.println("Too low");
            } else if (guess > secretNumber) {
                System.out.println("Too high");
            } else {
                System.out.println("Correct! You guessed it in "
                        + attempts + " attempts.");
                break;
            }
        }

        scanner.close();
    }
}