package JavaMiniProjects;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//NOTE: This system has no database or connection to SQL!

public class OnlineSurveySystem {
    //Set an input function by naming it "input", and creating a string where that input is stored.
    //The "score" array stores the points of the answer of the user
    static Scanner input = new Scanner(System.in);
    static String user_input;
    private static int score [] = new int[5];
    //These are the questions available in the survey. It has [4] index
    static String[] questions = {
        "1) how satisfied are you with your overall academic experience at our school?", 
        "2) In extracurricular activities you involved in, and how satisfied are you with the available options?",
        "3) Rate the communication between students, teachers, and administration at our school.",
        "4) How effectively is technology integrated into the learning experience at our school?",
        "5) How secure do you feel on campus, and are there specific areas that need attention for improved safety?"
    };
    static String[] choices = {"start","1","2","3","/1","/2"};
    static List<String> choicesList = Arrays.asList("start","1","2","3","/1","/2");
    public static void main(String[] args) {
        on_enter();
    }
    //This will prompt the basic guideliness when answering the survey
    public static void on_enter(){
        System.out.println("School Satisfaction Survey");
        System.out.println("***************************");
        System.out.println("Enter: 1 if you are Satisfied");
        System.out.println("Enter: 2 if you are Neutral");
        System.out.println("Enter: 3 if you are Unsatisfied");
        System.out.println("***************************");
        System.out.println("If you want to exit the system Enter: /1 \nIf you want to restart Enter: /2");
        System.out.println("***************************");
        System.out.println("To start the survey Enter: Start");
        //This will run the "decision_making" function along side showing the function
        decision_making(0, false);
    }
    //This function gets the users input and checkings the meet conditions prior to the users input
    public static void decision_making(int loop, boolean runned){
        System.out.print("Enter: ");
        //This gets the users input and store it in the "user_input" variable NOTE: THIS ONLY ACCEPT STRINGS
        user_input = input.nextLine();

        while (loop<=5) { 
            switch (user_input.toLowerCase()) { 
            case "/1": 
                System.exit(0); 
                break; 
            case "/2": 
                reset_points(); 
                on_enter(); 
                break; 
            case "start": 
                runned = true; 
                break; 
            case "1":
                add_elements(loop, 3);
                runned = true;
                loop++;
                break;
            case "2":
                add_elements(loop, 2);
                runned = true;
                loop++;
                break;
            case "3":
                add_elements(loop, 1);
                runned = true;
                loop++;
                break;
            }
            if (runned){
                runned = false;
                break;
            } else if (!choicesList.contains(user_input.toLowerCase())){
                reset_points();
                System.out.println("\n!!!!Invalid input, please try again!!!!\n");
                on_enter();
            }
        }
        display_questions(loop);
    }
    //This displays the questions one by one inside the array
    static void display_questions(int index){
        if (index == 5){
            the_end();
        }
        System.out.println(questions[index]);
        decision_making(index, false);
    }
    //This function will display the end prompt and exit the survey
    static void the_end(){
        System.out.println("Thank you");
        System.out.println(survey_results());
        System.exit(0);
    }
    //This method adds the total points of each choices and interprets its total
    private static String survey_results(){
        int total = 0;
        for(int i = 0; i < score.length; i++){
            total += score[i];
        }
        if (total <= 3){
            return "Sorry to hear that you are unsatisfied with the schools performance";
        } else if(total >= 6 && total < 9){
            return "We are glad that you are satisfied with the performance of the school";
        } else{
            return "We are happy to hear that you are over satisfied with the schools performance";
        }
    }
    //This adds points to the total variable, which will be later interpreted after the survey
    private static void add_elements(int index, int points){
        score[index] = points;
    }
    //This resets the total overall points to 0
    static void reset_points(){
        for(int i = 0; i < score.length; i++){
            score[i] = 0;
            }
    }

}