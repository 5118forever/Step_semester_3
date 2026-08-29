import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number1: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter number2: ");
        int number2 = scanner.nextInt();

        int original1 = number1;
        int original2 = number2;

        while (number2 != 0) {
            int remainder = number1 % number2;
            number1 = number2;
            number2 = remainder;
        }

        System.out.println("The GCD of " + original1 + " and " + original2 + " is " + number1);
        scanner.close();
    }

}