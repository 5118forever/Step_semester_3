import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double firstNumber = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double secondNumber = scanner.nextDouble();
        System.out.print("Enter operator: ");
        char operator = scanner.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println("Result: " + (firstNumber + secondNumber));
                break;
            case '-':
                System.out.println("Result: " + (firstNumber - secondNumber));
                break;
            case '*':
                System.out.println("Result: " + (firstNumber * secondNumber));
                break;
            case '/':
                if (secondNumber == 0) {
                    System.out.println("Cannot divide by zero");
                } else {
                    System.out.println("Result: " + (firstNumber / secondNumber));
                }
                break;
            default:
                System.out.println("Invalid operator");
        }
        scanner.close();
    }
}
