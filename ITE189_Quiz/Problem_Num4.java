package ITE189_Quiz;
/*
    Name: Ahron Paul P. Villacote
    Section: BSIT1-01
    Quiz#1
    Problem number 4
*/
import java.util.Scanner;

public class Problem_Num4 {
    public static void main(String[] args) {
        int [] subject = new int[3];
        Scanner input = new Scanner(System.in);
        double sum = 0;
        double average = 0;
        int len = subject.length;
        
        System.out.print("Enter ITE 399 Grade: ");
        subject[0] = input.nextInt();
        System.out.print("Enter Philosophy Grade: ");
        subject[1] = input.nextInt();
        System.out.print("Enter Ethics Grade: ");
        subject[2] = input.nextInt();

        for(int i = 0; i < subject.length; i++){
            sum = subject[i] + sum;
            average = sum / len;
        }
        
        System.out.format("Average: %.1f", average );
        System.out.println();
        input.close();

        if (average > 50 && average <= 100){
            System.out.println("Result: Pass");
        } else if (average <= 50 && average > 0){
            System.out.println("Result: Fail");
        } else {
            System.out.println("Invalid Input");
        }
    }
}
