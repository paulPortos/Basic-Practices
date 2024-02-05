package Kata;

public class SequenceSum {
    public static void main(String [] args) {
        System.out.println();
        sequenceSum(2, 6, 2);
    }
    public static int sequenceSum(int start, int end, int step) {
        int answer = 0;
        for(int i = start; i <= end; i+=step){
            answer += i;
        }
        return answer;
      }
}
