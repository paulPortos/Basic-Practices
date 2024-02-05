package Kata;

public class BasicOperation {
    public static void main(String[] args) {
        System.out.println(basicMath("+", 5, 5));
    }
    public static Integer basicMath(String op, int v1, int v2) {
        Integer answer = 0;
        switch (op) {
            case "+":
                answer = v1 + v2;
                break;
            case "-":
                answer = v1 - v2;
                break;
            case "*":
                answer = v1 * v2;
                break;
            case "/":
                answer = v1 / v2;
                break;
        }
    return answer;
  }
}
