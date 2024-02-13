package ITE189_Quiz;
/*
    Name: Ahron Paul P. Villacote
    Section: BSIT1-01
    Quiz#1
    Problem number 3
*/
import java.util.Scanner;

public class Problem_Num3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ITE 399 Grade: ");
        float ite = input.nextInt();
        System.out.print("Enter Philosophy Grade: ");
        float philosophy = input.nextInt();
        System.out.print("Enter Ethics Grade: ");
        float ethics = input.nextInt();

        float average = (ite + philosophy + ethics) / 3;
        System.out.format("Average: %.1f", average );
        System.out.println();

        if (average > 50 && average <= 100){
            System.out.println("Result: Pass");
        } else if (average <= 50 && average > 0){
            System.out.println("Result: Fail");
        } else {
            System.out.println("Invalid Input");
        }
        input.close();
    }
}
