package Kata;

public class ArrayPlusArray {
    public static void main(String[] args) {
        int [] f = {3,4,6,8};
        int [] t = {5,4,6,8};
        System.out.println(arrayPlusArray(f,t,0));
    }
    public static int arrayPlusArray(int[] arr1, int[] arr2, int x) {
        for(int i = 0; i < arr1.length; i++){
            x += arr1[i];
        }
        for(int i = 0; i < arr2.length; i++){
            x += arr2[i];
        }
        return x;
      }
}
