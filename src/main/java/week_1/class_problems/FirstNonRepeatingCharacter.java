import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    static char findFirstNonRepeating(String text) {

        int[] frequency = new int[256];

        for (int index = 0; index < text.length(); index++) {
            frequency[text.charAt(index)]++;
        }

        for (int index = 0; index < text.length(); index++) {
            if (frequency[text.charAt(index)] == 1) {
                return text.charAt(index);
            }
        }

        return '\0';
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        char result = findFirstNonRepeating(text);

        if (result == '\0') {
            System.out.println("No non-repeating character found.");
        } else {
            System.out.println("First non-repeating character: " + result);
        }

        scanner.close();
    }
}