package ITE186_Module;

public class M7_SBA {

    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    public static void exercise1(){
        //First we create an array called array with the required values which is "This is a string array"
        String[] array = {"This", "is", "a", "string", "array"};
        //There are 2 ways to call each element first is using the print function which is unlikely to be accepted
        //Ill just show you but this is not the right way to do this
        //System.out.println(array[0] + "\n" + array[1] + "\n" + array[2] + "\n" + array[3] + "\n" + array[4]);

        //The second one is a little bit hard, we will use loop to print each element
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    public static void exercise2(){
        //First we will create an array called numbers and add 23, 6, 47, 35, 2, 14
        int[] numbers = {23, 6, 47, 35, 2, 14};
        //Lets create an int name total which will store the sum of each element
        int total = 0;
        //Now we will sum all of these array in a loop
        for(int i = 0; i < numbers.length; i++){
            total += numbers[i];
        }
        //Now we will create an average equation and store it to our variable named avg
        int avg = total / numbers.length;
        //Then we will now display the sum of the array and the average of the array
        System.out.println("Sum = " + total);
        System.out.println("Average = " + avg);

    }
}