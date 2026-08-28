import java.util.Scanner;
public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = scanner.nextInt();
        int counter = 1;
        int sum = 0;
        while (counter <= n) {
            sum = sum + counter;
            counter++;
        }
        System.out.println("Sum of numbers from 1 to " + n + " = " + sum);

        scanner.close();
    }
}
