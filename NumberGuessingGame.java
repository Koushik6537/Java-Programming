import java.util.*;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        Random random = new Random();
        System.out.println("!!!-----Welcome to Number Guessing Game-----!!!");
        System.out.println("I have generated a random number between 1 to 100. Can you guess that number ?");
        System.out.println("Have Fun");
        int randomNumber = random.nextInt(100)+1;
        int guess = 0;
        int attempts = 0;
        while(guess != randomNumber){
            System.out.println("Guess the number: ");
            guess = scanner.nextInt();
            attempts=attempts+1;

            if(guess<randomNumber){
                System.out.println("Too low, guess a bigger number.");
            } else if (guess>randomNumber){
                System.out.println("Too high, guess a smaller number.");
            } else {
                System.out.println("Congratulations!!!\n you have guessed the number.");
                System.out.println("It took you "+attempts+" attempts.");
            }
        }
        scanner.close();
    }
}
