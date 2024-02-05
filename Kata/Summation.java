package Kata;

public class Summation {
    public static void main(String[] args) {
        System.out.println(summation(5));
    }
    public static int summation(int n) {
        int answer = 0;
        for(int i = 1; i <=n; i++){
            answer += i;
        }
        return answer;
    }
}
