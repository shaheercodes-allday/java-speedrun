import java.util.Random;
import java.util.Scanner;

class GuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("We have a random number. Guess the number (between 1 to 100)");

        while (true) {
            System.out.print(">> ");
            int guess = scanner.nextInt();

            if (guess > randomNumber) {
                System.out.println("Too large!");
            } else if (guess < randomNumber) {
                System.out.println("Too small!");
            } else {
                System.out.println("BINGO!!! you guessed the number!");
                break;
            }
        }
    }
}

