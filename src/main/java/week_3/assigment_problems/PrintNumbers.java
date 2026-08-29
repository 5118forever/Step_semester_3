import java.util.Scanner;
public class PrintNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = scanner.nextInt();
        for (int counter = 1; counter <= n; counter++) {
            System.out.println(counter);
        }
        scanner.close();
    }
}
