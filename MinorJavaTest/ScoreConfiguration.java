package MinorJavaTest;

/*
 This test is linked to "OnlineSurveySystem.java"
 */

public class ScoreConfiguration {
    //Declaration of index in the array
    public static int score [] = {3,2,1,4,7};
    
    public static void main(String[] args) {
        //Declaration of array elements
        //Display Array Elements
        display_array(score);
        //Display Array Summation of elements
        System.out.println("Total: " + summated_array(score));
    }
    //This method resets the whole array
    static void reset_array(){
        for(int i = 0; i < score.length; i++){
            score[i] = 0;
        }
    }
    //This method displays the elements of an array
    static void display_array(int arrayName[]){
        for(int i : arrayName){
            System.out.println(i);
        }
    }
    //This method sums the element of the array
    static int summated_array(int arrayName[]){
        int total = 0;
        for(int i = 0; i < arrayName.length; i++){
            total += arrayName[i];
        }
        return total;
    }
}

//STATUS: COMPLETED