package ITE_TASK;
//AHRON PAUL P. VILLACOTE
//FEBUARY 28, 2028
//BSIT1-01
import java.util.Scanner;
//PAA = PROGRAMMING ASSESSMENT ACTIVITY
public class PAA7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 10 Letters: ");
        int uppercases = 0, lowercases = 0;
        char letter;
        for(int i = 0; i < 10; i++){
            letter = input.next().charAt(0);
            if (Character.isUpperCase(letter)) {
                uppercases++;
            } else if (Character.isLowerCase(letter)) {
                lowercases++;
            } 
        }
        System.out.println("Uppercase: " + uppercases);
        System.out.println("Lowercase: " + lowercases);
        input.close();
    }
}
