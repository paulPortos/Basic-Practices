package ITE189_Quiz;
/*
    Name: Ahron Paul P. Villacote
    Section: BSIT1-01
    Quiz#1
    Problem number 1
*/
import java.util.Scanner;

public class Problem_Num1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = input.nextLine();
        System.out.print("Enter Age: ");
        int age = input.nextInt();
        System.out.print("House Number: ");
        int house_number = input.nextInt();
        System.out.print("Barangay: ");
        String barangay = input.next();
        System.out.print("Municipality: ");
        String municipality = input.next();
        System.out.print("Province: ");
        String province = input.next();
        System.out.print("Birthdate: ");
        String birthdate = input.next();

        System.out.println("Im " + name + " and Im " + age + " years old live in " + house_number + ", " + barangay + ", " + municipality + ", " + province + " and my birthdate is " + birthdate);
        input.close();
    }
}
