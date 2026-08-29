import java.util.Scanner;
public class LoginAttemptSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter correct code: ");
        String correctCode = scanner.nextLine();
        String[] attempts = new String[3];
        System.out.println("Enter 3 attempts:");
        for (int attempt = 0; attempt < 3; attempt++) {
            attempts[attempt] = scanner.nextLine();
        }
        boolean accessGranted = false;
        for (int attempt = 0; attempt < 3; attempt++) {

            if (attempts[attempt].equals(correctCode)) {
                System.out.println("Access granted on attempt " + (attempt + 1));
                accessGranted = true;
                break;
            }
        }
        if (!accessGranted) {
            System.out.println("Access denied — all attempts used");
        }
        scanner.close();
    }
}
