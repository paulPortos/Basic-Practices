package ITE_TASK;
//AHRON PAUL P. VILLACOTE
//FEBUARY 28, 2028
//BSIT1-01

import java.util.Scanner;
//PAA = PROGRAMMING ASSESSMENT ACTIVITY
public class PAA4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("90 to 100 = A\r\n" + //
                "75 to below 90 = B\r\n" + //
                "50 to below 75 = C\r\n" + //
                "Below 50 = F\r\n" + //
                "Below 0 or above 100 = OUT OF RANGE");

        try {
            System.out.print("Enter Grade Value: ");
            float enteredGrade = input.nextFloat();
            System.out.println("--------------------------------");
            if (enteredGrade >= 90 && enteredGrade <= 100) {
                System.out.println("The Numeric value of " + enteredGrade + " is : " + "A");
            } else if (enteredGrade >= 75 && enteredGrade < 90) {
                System.out.println("The Numeric value of " + enteredGrade + " is : " + "B");
            } else if (enteredGrade >= 50 && enteredGrade < 75) {
                System.out.println("The Numeric value of " + enteredGrade + " is : " + "C");
            } else if (enteredGrade < 50) {
                System.out.println("The Numeric value of " + enteredGrade + " is : " + "F");
            } else {
                System.out.println("Input grade is out of range");
            }
        } catch (Exception e) {
            System.out.println("----------------------");
            System.out.println("Enter a numeric value!");
        }
        input.close();
    }
}
