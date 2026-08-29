import java.util.Scanner;
public class RightAngledTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = scanner.nextInt();

        System.out.println("The right-angled triangle pattern for " + rows + " rows is");

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            scanner.close();
        }
    }
}
    

