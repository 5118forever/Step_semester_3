import java.util.Scanner;

public class BMICalculator {

    static String getCategory(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of team members: ");
        int numberOfMembers = scanner.nextInt();

        double[] heights = new double[numberOfMembers];
        double[] weights = new double[numberOfMembers];

        for (int member = 0; member < numberOfMembers; member++) {

            System.out.print("Enter height of member " + (member + 1) + " in meters: ");
            heights[member] = scanner.nextDouble();

            System.out.print("Enter weight of member " + (member + 1) + " in kg: ");
            weights[member] = scanner.nextDouble();
        }

        System.out.println("\nBMI Report");
        System.out.println("Member\tHeight\tWeight\tBMI\tCategory");

        for (int member = 0; member < numberOfMembers; member++) {

            double bmi = weights[member] /
                         (heights[member] * heights[member]);

            String category = getCategory(bmi);

            System.out.printf("%d\t%.2f\t%.2f\t%.2f\t%s%n",
                    member + 1,
                    heights[member],
                    weights[member],
                    bmi,
                    category);
        }

        scanner.close();
    }
}
