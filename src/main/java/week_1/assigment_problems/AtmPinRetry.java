import java.util.Scanner;
public class AtmPinRetry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter correct PIN: ");
        String correctPin = scanner.nextLine();
        String[] attempts = new String[3];
        System.out.println("Enter 3 PIN attempts:");
        for (int index = 0; index < 3; index++) {
            attempts[index] = scanner.nextLine();
        }
        int attempt = 0;
        boolean success = false;
        while (attempt < 3 && !success) {
            if (attempts[attempt].equals(correctPin)) {
                success = true;
                System.out.println("PIN accepted");
                break;
            }
            attempt++;
        }
        if (!success) {
            System.out.println("Card blocked : Too many incorrect attempts");
        }
        scanner.close();
    }
}
