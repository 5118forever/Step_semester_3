public class SkipMultiplesOfThree {
    public static void main(String[] args) {
        for (int number = 1; number <= 20; number++) {
            if (number % 3 == 0) {
                continue;
            }
            System.out.println(number);
        }
    }
}