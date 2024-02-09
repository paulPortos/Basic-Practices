package MinorJavaTest;
import java.util.Random;
import java.util.Scanner;

/*
    Program features
    -Random
    -Game loop until you win
    -Scanner
    -3 Trials only
 */
public class RandomDiced {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        boolean run = true;
        int tried = 0;
        while (run){
            System.out.print("Enter your guess: ");
            int guess = input.nextInt();
            int answer = random.nextInt(5);
            System.out.println("The answer is " + answer);
            if (guess == answer){
                run = false;
                System.out.println("You won! congrats");
            } else {
                System.out.println("Wrong guess try again\n");
                tried++;
            }
            if (tried == 3){
                run = false;
                System.out.println("You have reached the 3 trial mark");
            }
        }
    }
}
