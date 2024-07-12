package ITE_TASK;
//AHRON PAUL P. VILLACOTE
//FEBUARY 28, 2028
//BSIT1-01
import java.util.Scanner;
//PAA = PROGRAMMING ASSESSMENT ACTIVITY
public class PAA8 {
    public static void main(String[] args) {

        char vowels[] = { 'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u', };
        char consunants[] = { 'B', 'b', 'C', 'c', 'D', 'd', 'F', 'f', 'G', 'g', 'H', 'h', 'J', 'j', 'K', 'k', 'L', 'l',
                'M', 'm', 'N', 'n', 'P', 'p', 'Q', 'q', 'R', 'r', 'S', 's', 'T', 't', 'V', 'v', 'W', 'w',
                'X', 'x', 'Y', 'y', 'Z', 'z', };
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a Character: ");
        char inputCharacter = in.nextLine().charAt(0);

        boolean uppercaseVowel = false, lowercaseVowel = false, uppercaseConsunant = false, lowercaseConsunant = false;

        for (char j : consunants) {
            if (inputCharacter == j) {
                if (Character.isUpperCase(inputCharacter)) {
                    uppercaseConsunant = true;
                    break;
                } else if (Character.isLowerCase(inputCharacter)) {
                    lowercaseConsunant = true;
                    break;
                }
            }
            for (char x : vowels) {
                if (inputCharacter == x) {
                    if (Character.isUpperCase(inputCharacter)) {
                        uppercaseVowel = true;
                        break;
                    } else if (Character.isLowerCase(inputCharacter)) {
                        lowercaseVowel = true;
                        break;
                    }
                }
            }
        }
        System.out.println("--------------------");
        if (lowercaseConsunant) {
            System.out.print(inputCharacter + " is a:\n" + "CONSUNANT \n\rLOWERCASE");
        } else if (uppercaseConsunant) {
            System.out.print(inputCharacter + " is a:\n" + "CONSUNANT \n\rUPPERCASE");
        } else if (lowercaseVowel) {
            System.out.print(inputCharacter + " is a:\n" + "VOWEL \n\rLOWERCASE");
        } else if (uppercaseVowel) {
            System.out.print(inputCharacter + " is a:\n" + "VOWEL \n\rUPPERCASE");
        } else {
            System.out.println("INVALID INPUT");
        }
        in.close();
    }
}