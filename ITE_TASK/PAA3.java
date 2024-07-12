package ITE_TASK;
//AHRON PAUL P. VILLACOTE
//FEBUARY 28, 2028
//BSIT1-01

import java.util.Scanner;
//PAA = PROGRAMMING ASSESSMENT ACTIVITY
public class PAA3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Character: ");
        String enteredCharacter = input.next();
        String[] vowels = { "A", "a", "E", "e", "I", "i", "O", "o", "U", "u", };
        boolean ifVowel = false;
        for (String x : vowels) {
            if (x.equals(enteredCharacter)) {
                ifVowel = true;
                break;
            } else {
                ifVowel = false;
            }
        }
        if (ifVowel) {
            System.out.println(enteredCharacter + " is a Vowel");
            System.out.println("Other vowels are: ");
            for(String x: vowels){
                if (enteredCharacter.equals(x)) {
                    continue;
                } else {
                    System.out.print(x + ", ");
                }
            }
        } else {
            System.out.println(enteredCharacter + " Not a Vowel");
            System.out.print("Vowels are: ");
            for(String x:  vowels){
                System.out.print(x + ", ");
            }
        }
        input.close();
    }
}
