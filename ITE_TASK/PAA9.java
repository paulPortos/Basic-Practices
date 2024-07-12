package ITE_TASK;
//AHRON PAUL P. VILLACOTE
//FEBUARY 28, 2028
//BSIT1-01
import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;
//PAA = PROGRAMMING ASSESSMENT ACTIVITY
public class PAA9 {
    public static void main(String[] args) {

        int inputNumbers[] = new int[3];
        Scanner in = new Scanner(System.in);

        System.out.println("Enter three numbers: ");

        for (int i = 0; i < 3; i++) {
            while (true) {
                System.out.print((i + 1) + ".) ");
                try {
                    inputNumbers[i] = in.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Please enter a  integer value.");
                    in.nextLine();
                }
            }
        }

        Arrays.sort(inputNumbers);
        if (inputNumbers[0] == inputNumbers[2]) {
            System.out.print("EQUAL VALUES");

        } else {
            String ascending = " ";
            for (int x : inputNumbers) {
                ascending += x + " ";
            }
            System.out.println("ASCENDING:" + ascending);

            for (int i = 0; i < inputNumbers.length / 2; i++) {
                int des = inputNumbers[i];
                inputNumbers[i] = inputNumbers[inputNumbers.length - 1 - i];
                inputNumbers[inputNumbers.length - 1 - i] = des;
            }
            String descending = " ";
            for (int x : inputNumbers) {
                descending += x + " ";
            }
            System.out.println("DESCENDING:" + descending);

        }
        in.close();
    }

}