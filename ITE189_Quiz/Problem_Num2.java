package ITE189_Quiz;
/*
    Name: Ahron Paul P. Villacote
    Section: BSIT1-01
    Quiz#1
    Problem number 2
*/
import java.util.Scanner;

public class Problem_Num2 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int first_number = input.nextInt();
        System.out.print("Enter Second Number: ");
        int second_number = input.nextInt();
        System.out.println();

        int addition = first_number + second_number;
        int subtraction = first_number - second_number;
        int multiplication = first_number * second_number;
        int division = first_number / second_number;

        System.out.println("Addition: " + addition + "\n" + "Subtraction: " + subtraction + "\n" + "Multiplication: " + multiplication + "\n" + "Division: " + division);
        input.close();
    }
}
