package Kata;

public class SumArrays {
    public static void main(String[] args) {
        double [] myNum = {0};
        System.out.println(sum(myNum));
    }
    public static double sum(double[] numbers) {
        double x = 0;
        for(int i = 0; i < numbers.length; i++){
            x += numbers[i];
        }
        return x;
    }
}
