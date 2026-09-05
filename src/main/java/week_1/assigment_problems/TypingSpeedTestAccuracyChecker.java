import java.util.Scanner;

public class TypingSpeedTestAccuracyChecker {

    static void checkTypingAccuracy(String original, String typed) {

        int matched = 0;
        int firstMismatch = -1;

        int length = Math.min(original.length(), typed.length());

        for (int index = 0; index < length; index++) {

            if (original.charAt(index) == typed.charAt(index)) {
                matched++;
            } else if (firstMismatch == -1) {
                firstMismatch = index;
            }
        }

        int total = original.length();

        double accuracy = (matched * 100.0) / total;

        System.out.printf("Matched: %d/%d%n", matched, total);
        System.out.printf("Accuracy: %.2f%%%n", accuracy);

        if (firstMismatch == -1 && original.length() == typed.length()) {
            System.out.println("No Mismatches");
        } else if (firstMismatch != -1) {
            System.out.println("First Mismatch at position "
                    + (firstMismatch + 1));
        } else {
            System.out.println("Length Mismatch");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter original passage: ");
        String original = scanner.nextLine();

        System.out.print("Enter typed text: ");
        String typed = scanner.nextLine();

        checkTypingAccuracy(original, typed);

        scanner.close();
    }
}
