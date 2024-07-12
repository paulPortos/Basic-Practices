package ITE189_Exam;
/*
    Name: Ahron Paul P. Villacote
    Section: BSIT1-01
    Exam
*/
import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float balance = 0, totalBalance  = 0;
        String [] availableFruits = {"A", "P", "PA", "O", "L"};
        int [] prices = {10, 10, 35, 10, 10};
        System.out.println("Menu:\r\n" + "Apple: 10\r\n" + "Peaches: 10\r\n" + "Pineapple: 35\r\n" + "Orange: 10\r\n" + "Lime: 10");
        
        boolean run = true;
        while (run) {

            String enteredFruit = "";
            int pieces = 0;
            String ask = "";
            System.out.println("\nWhat do you like?\r\n" + "A for Apple\r\n" + "P for Peaches\r\n" + "PA for Pineapple\r\n" + "O for Orange\r\n" + 
            "L for Lime\n");
            
            System.out.print("Enter Selection: ");
            enteredFruit = input.next();
            System.out.print("Enter Pieces: ");
            pieces = input.nextInt();

            System.out.print("Would you like to have another order: (Y/N) ");
            ask = input.next();

            for(int i = 0; i < availableFruits.length; i++){
                if(availableFruits[i].equals(enteredFruit)){
                    switch (enteredFruit) {
                        case "A": balance = prices[0] * pieces; break;
                        case "P": balance = prices[1] * pieces; break;  
                        case "PA":balance = prices[2] * pieces; break;
                        case "O": balance = prices[3] * pieces; break;
                        case "L": balance = prices[4] * pieces; break;    
                    }
                }
            }
            totalBalance += balance;
            if(ask.toUpperCase().equals("Y")){continue;} 
            else if (ask.toUpperCase().equals("N")){run = false;}
        }     
        System.out.println("\nbalance: " + totalBalance);
        if (totalBalance >= 500){System.out.println("Discounted Price: " + (totalBalance * 0.90));}
        input.close();
    }
}
