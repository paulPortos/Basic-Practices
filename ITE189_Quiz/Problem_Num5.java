package ITE189_Quiz;
/*
    Name: Ahron Paul P. Villacote
    Section: BSIT1-01
    Quiz#1
    Problem number 5
*/
import java.util.Scanner;

public class Problem_Num5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter principle ammount: ");
        float p = input.nextInt();
        System.out.println("Enter time in years: ");
        float t = input.nextInt();
        System.out.println("Enter rate annually: ");
        float r = input.nextInt();

        float simple_interest = p*t*r / 100;
        System.out.println("Simple interested calculate by program is: " + simple_interest);
        input.close();
    }
}
