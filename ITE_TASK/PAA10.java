package ITE_TASK;
//AHRON PAUL P. VILLACOTE
//FEBUARY 28, 2028
//BSIT1-01
import java.util.Scanner;
//PAA = PROGRAMMING ASSESSMENT ACTIVITY
public class PAA10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ammount: ");
        int[] count = new int[8];
        int[] numbers = { 500, 200, 100, 50, 20, 10, 5, 1 };
        int ammount = input.nextInt();
        int totalCount = 0;
        while (ammount > 0) {

            if ((ammount / 500) >= 1) {
                totalCount = ammount / numbers[0];
                ammount %= numbers[0];
                count[0] = totalCount;
            } else if ((ammount / 200) >= 1) {
                totalCount = ammount / numbers[1];
                ammount %= numbers[1];
                count[1] = totalCount;
            } else if ((ammount / 100) >= 1) {
                totalCount = ammount / numbers[2];
                ammount %= numbers[2];
                count[2] = totalCount;
            } else if ((ammount / 50) >= 1) {
                totalCount = ammount / numbers[3];
                ammount %= numbers[3];
                count[3] = totalCount;
            } else if ((ammount / 20) >= 1) {
                totalCount = ammount / numbers[4];
                ammount %= numbers[4];
                count[4] = totalCount;
            } else if ((ammount / 10) >= 1) {
                totalCount = ammount / numbers[5];
                ammount %= numbers[5];
                count[5] = totalCount;
            } else if ((ammount / 5) >= 1) {
                totalCount = ammount / numbers[6];
                ammount %= numbers[6];
                count[6] = totalCount;
            } else if ((ammount / 1) >= 1) {
                totalCount = ammount / numbers[7];
                ammount %= numbers[7];
                count[7] = totalCount;
            }
            totalCount = 0;
        }
        for(int i = 0; i < count.length; i++){
            System.out.println(numbers[i] + ": " + count[i]);
        }
        input.close();
    }
}
