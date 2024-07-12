package ITE_TASK;
//AHRON PAUL P. VILLACOTE
//FEBUARY 28, 2028
//BSIT1-01

import java.util.Scanner;
//PAA = PROGRAMMING ASSESSMENT ACTIVITY
public class PAA2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        float[] numbers = new float[3];
        for (int i = 0; i < numbers.length; i++) {
            switch (i) {
                case 0:
                    System.out.print((i + 1) + ") ");
                    numbers[0] = input.nextFloat();
                    break;
                case 1:
                    System.out.print((i + 1) + ") ");
                    numbers[1] = input.nextFloat();
                    break;
                case 2:
                    System.out.print((i + 1) + ") ");
                    numbers[2] = input.nextFloat();
                    break;
            }
        }

        System.out.println(
                "The sum of " + numbers[0] + ", " + numbers[1] + "," + " and " + numbers[2] + " is: "
                        + (numbers[0] + numbers[1] + numbers[2]));
        input.close();
    }
}
