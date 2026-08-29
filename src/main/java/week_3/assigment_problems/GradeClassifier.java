import java.util.Scanner;
public class GradeClassifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = scanner.nextInt();
        System.out.print("Enter attendance: ");
        int attendance = scanner.nextInt();
        if (attendance >= 75 && marks >= 40) {
            if (marks >= 90) {
                System.out.println("Grade: A");
            } else if (marks >= 75) {
                System.out.println("Grade: B");
            } else if (marks >= 60) {
                System.out.println("Grade: C");
            } else {
                System.out.println("Grade: D");
            }
        } else {
            System.out.println("Detained");
        }
        scanner.close();
    }
}
