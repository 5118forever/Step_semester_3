import java.util.Scanner;

public class TrafficSignalStreakAnalyzer {

    static void findLongestStreak(String signalLog) {

        if (signalLog.isEmpty()) {
            System.out.println("No signal readings found.");
            return;
        }

        char longestColor = signalLog.charAt(0);
        int longestStreak = 1;

        char currentColor = signalLog.charAt(0);
        int currentStreak = 1;

        for (int index = 1; index < signalLog.length(); index++) {

            if (signalLog.charAt(index) == currentColor) {
                currentStreak++;
            } else {
                currentColor = signalLog.charAt(index);
                currentStreak = 1;
            }

            if (currentStreak > longestStreak) {
                longestStreak = currentStreak;
                longestColor = currentColor;
            }
        }

        System.out.println("Longest Streak: '" + longestColor
                + "' repeated " + longestStreak + " times");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter signal log (R/Y/G): ");
        String signalLog = scanner.nextLine().toUpperCase();

        findLongestStreak(signalLog);

        scanner.close();
    }
}