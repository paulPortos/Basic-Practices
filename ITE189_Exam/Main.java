package ITE189_Exam;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] prices= {10, 10, 35, 10, 10};
		String choice = "";
		int quantity=0;
		double total =0;
		
		do{
			System.out.println("Menu:\n"+"Apple: 10\n"+"Peaches: 10\n"+"Pineapple: 35\n"+"Orange: 10\n"+"Lime: 10\n");	
			System.out.print("what do you like?\n"+"A for Apple\n"+
			"P for Peaches\n"+"PA for Pineapple\n"+"O for Orange\n"+
			"L for Lime\n"+"\nEnter Selection: ");
			choice= scanner.next().toUpperCase();
 
 	       System.out.print("How many Pieces: ");
 	       quantity = scanner.nextInt();
 	 
 	 	switch(choice){
 	 		case "A":
 	 		   total += prices[0] * quantity;
 	 		   break;
 	 		 case "P":
 	 		      total += prices[1] * quantity;
 	 		   break;
 	 		  case "PA":
 	 		       total += prices[2] * quantity;
 	 		   break;
 	 			case "O":
 	 			   total += prices[3] * quantity;
 	 		   break;
 	 		   case "LA":
 	 		      total += prices[4] * quantity;
 	 		   break;
 	 	  default:
 	 		   System.out.println("Invalid choice!");
 	 	}
 	 	  
 	 	  System.out.print("Would you like to have another order:(Y/N) ");
		}while (Character.
toUpperCase(scanner.next().charAt (0))=='Y');
   
     System.out.println("\nTotal:" + total);
     
     if(total >= 500){
     	double discountedTotal = total * 0.9;
     System.out.println("Discounted Total:" + discountedTotal );
        }
	scanner.close();
	}
}