import java.util.Arrays;

public class asd {
    public static void main(String[] args) {
        int x[] = { 12, 123, 3, 213, 214, 5, 56, 67568, 89, 834 };
        for (int i : x) {
            System.out.print(i + " ");
        }
        Arrays.sort(x);
        System.out.println("Arranged decend");
        for (int i = x.length-1; i >= 0; i--) {
            System.out.print(x[i] + ", ");
        }
        System.out.println("Arranged ascend");
        for (int i : x) {
            System.out.print(i + ", ");
        }
        
    }
}
