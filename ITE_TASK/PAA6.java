package ITE_TASK;
//AHRON PAUL P. VILLACOTE
//FEBUARY 28, 2028
//BSIT1-01
import java.util.Scanner;
//PAA = PROGRAMMING ASSESSMENT ACTIVITY
public class PAA6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter an arithmetic expression: ");
        String expression = input.nextLine();
        
        expression = expression.replaceAll("\\s+", "");
        
        String[] operands = expression.split("[+\\-*/]");
        String[] operators = expression.split("\\d+");
        
        double result = Double.parseDouble(operands[0]);
        
        
        for (int i = 1; i < operands.length; i++) {
            double operand = Double.parseDouble(operands[i]);
            
            
            switch (operators[i].charAt(0)) {
                case '+':
                    result += operand;
                    break;
                case '-':
                    result -= operand;
                    break;
                case '*':
                    result *= operand;
                    break;
                case '/':
                    result /= operand;
                    break;
                default:
                    System.out.println("Invalid operator: " + operators[i].charAt(0));
                    return;
            }
        }
        
        System.out.println("Result: " + result);
        input.close();
    }
}
