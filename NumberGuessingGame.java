import java.util.*;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int secnum = ran.nextInt(100) + 1; 
        int guess;
        int attempts = 0;
        System.out.println("Number Guessing Game");
        System.out.println("Guess a number between 1 and 100");
        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;
            if (guess > secnum) {
                System.out.println("Too High! Try Again.");
            } 
            else if (guess < secnum) {
                System.out.println("Too Low! Try Again.");
            } 
            else {
                System.out.println("Congratulations! You guessed the correct number.");
                System.out.println("No.of attempts: " + attempts);
            }
        } while (guess != secnum);
    }
}