import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of candidates: ");
        int size = scanner.nextInt();
        int[] candidates = new int[size];
        System.out.println("Enter candidates:");
        for (int index = 0; index < size; index++) {
            candidates[index] = scanner.nextInt();
        }
        for (int index = 0; index < size; index++) {
            if (candidates[index] < 1) {
                System.out.println("Skipping invalid number: " + candidates[index]);
                continue;
            }
            for (int multiplier = 1; multiplier <= 10; multiplier++) {
                System.out.println(candidates[index] + " x " + multiplier
                        + " = " + (candidates[index] * multiplier));
            }
            break;
        }
        scanner.close();
    }
}
