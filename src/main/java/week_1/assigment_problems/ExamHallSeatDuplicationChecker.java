import java.util.Scanner;

public class ExamHallSeatDuplicationChecker {

    static void checkDuplicateSeats(int[] seatNumbers) {

        boolean duplicateFound = false;

        for (int firstIndex = 0; firstIndex < seatNumbers.length; firstIndex++) {

            for (int secondIndex = firstIndex + 1;
                 secondIndex < seatNumbers.length;
                 secondIndex++) {

                if (seatNumbers[firstIndex] == seatNumbers[secondIndex]) {
                    System.out.println("Duplicate Seat Number Found: "
                            + seatNumbers[firstIndex]);
                    duplicateFound = true;
                }
            }
        }

        if (!duplicateFound) {
            System.out.println("No Duplicate Seats Found");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of seats: ");
        int numberOfSeats = scanner.nextInt();

        int[] seatNumbers = new int[numberOfSeats];

        for (int index = 0; index < numberOfSeats; index++) {
            System.out.print("Enter seat number " + (index + 1) + ": ");
            seatNumbers[index] = scanner.nextInt();
        }

        checkDuplicateSeats(seatNumbers);

        scanner.close();
    }
}