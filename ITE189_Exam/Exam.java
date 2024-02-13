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
        
        float total = 0;
        float finalTotal = 0;
        String [] fruits = {"A", "P", "PA", "O", "L"};
        int [] fruitPrice = {10, 10, 35, 10, 10};
        System.out.println("Menu:\r\n" + 
                        "Apple: 10\r\n" + 
                        "Peaches: 10\r\n" + 
                        "Pineapple: 35\r\n" + 
                        "Orange: 10\r\n" + 
                        "Lime: 10");

        boolean run = true;
        while (run) {
            String enteredFruit = "";
            int pieces = 0;
            String continuation = "";
            System.out.println("\nWhat do you like?\r\n" + 
                                "A for Apple\r\n" + 
                                "P for Peaches\r\n" + 
                                "PA for Pineapple\r\n" + 
                                "O for Orange\r\n" + 
                                "L for Lime\n");
            
            System.out.print("Enter Selection: ");
            enteredFruit = input.next();
            System.out.print("Enter Pieces: ");
            pieces = input.nextInt();

            System.out.print("Would you like to have another order: (Y/N) ");
            continuation = input.next();

            for(int i = 0; i < fruits.length; i++){
                if(fruits[i].equals(enteredFruit)){
                    switch (enteredFruit) {
                        case "A":
                            total = fruitPrice[0] * pieces;
                            break;
                        case "P":
                            total = fruitPrice[1] * pieces;
                            break;
                        case "PA":
                            total = fruitPrice[2] * pieces;
                            break;
                        case "O":
                            total = fruitPrice[3] * pieces;
                            break;
                        case "L":
                            total = fruitPrice[4] * pieces;
                            break;
                    }
                }
            }
            finalTotal += total;
            if(continuation.toUpperCase().equals("Y")){
                continue;
            } else if (continuation.toUpperCase().equals("N")){
                run = false;
            }
        }     
        System.out.println("\nTotal: " + finalTotal);
        if (finalTotal >= 500){
            System.out.println("Discounted Price: " + (finalTotal * 0.90));
        }
        input.close();
    }
}
