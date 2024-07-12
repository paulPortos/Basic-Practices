package ITE_TASK;

//AHRON PAUL P. VILLACOTE
//FEBUARY 28, 2028
//BSIT1-01

import java.util.Scanner;
//PAA = PROGRAMMING ASSESSMENT ACTIVITY
public class PAA5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double answer = 0;
        try {
            System.out.print("Enter Peso Value: ");
            double pesos = input.nextInt();
            System.out.println("---Menu---");
            System.out.println("[A] Dollar\r\n" + //
                    "[B] Yen\r\n" + //
                    "[C] Rial");
            System.out.print("Choice: ");
            String choice = input.next();
            if (choice.equals("A")) {
                answer = pesos * (1.0 / 44.52);
                System.out.format("Dollar Value: %.3f", answer);
            } else if (choice.equals("B")) {
                answer = pesos * (1.0 / 0.437);
                System.out.format("Yen Value: %.3f", answer);
            } else if (choice.equals("C")) {
                answer = pesos * (1.0 / 0.084);
                System.out.format("Rial Value: %.3f", answer);
            }
        } catch (Exception e) {
            System.out.println("\nPlease enter a numeric value!");
        }

        input.close();
    }
}
