package ITE_TASK;
//AHRON PAUL P. VILLACOTE
//FEBUARY 28, 2028
//BSIT1-01

import java.util.Scanner;
//PAA = PROGRAMMING ASSESSMENT ACTIVITY
public class PAA1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num = 0;
        float answer = 0;

        System.out.println("Enter four numbers: ");
        for (int i = 0; i < 4; i++) {
            try {
                System.out.print((i + 1) + ") ");
                num = input.nextFloat();
                answer += num;
            } catch (Exception e) {
                System.out.println("Something went wrong.");
                break;
            }
        }
        System.out.println("TOTAL: " + Math.round(answer));
        System.out.format("Average: %.2f", (answer / 4));
        input.close();
    }
}
