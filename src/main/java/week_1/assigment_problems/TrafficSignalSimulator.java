import java.util.Scanner;

public class TrafficSignalSimulator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of cycles: ");
        int cycles = scanner.nextInt();

        int state = 0;

        for (int cycle = 1; cycle <= cycles; cycle++) {

            switch (state) {
                case 0:
                    System.out.println("Red - Stop");
                    break;

                case 1:
                    System.out.println("Green - Go");
                    break;

                case 2:
                    System.out.println("Yellow - Prepare to stop");
                    break;
            }

            state = (state + 1) % 3;
        }

        scanner.close();
    }
}
