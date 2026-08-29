import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        int origNumber = number;
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum = sum + digit * digit * digit;
            number = number / 10;
        }
        System.out.println("Is the number " + origNumber
                + " an Armstrong number? " + (sum == origNumber));
        scanner.close();    
    }
}
