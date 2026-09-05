import java.util.Scanner;

public class ReverseCustomerName {

    static String reverseName(String name) {
        String reversed = "";

        for (int index = name.length() - 1; index >= 0; index--) {
            reversed = reversed + name.charAt(index);
        }

        return reversed;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();

        String reversedName = reverseName(name);

        System.out.println("Original Name: " + name);
        System.out.println("Reversed Name: " + reversedName);

        scanner.close();
    }
}
