package MinorJavaTest;

public class QuestionsRunThru {
    static String[] questions = {
        "1) how satisfied are you with your overall academic experience at our school?", 
        "2) In extracurricular activities you involved in, and how satisfied are you with the available options?",
        "3) Rate the communication between students, teachers, and administration at our school.",
        "4) How effectively is technology integrated into the learning experience at our school?",
        "5) How secure do you feel on campus, and are there specific areas that need attention for improved safety?"
    };  

    public static void main(String[] args) {
        display_array(questions);
    }

    static void display_array(String arrayName[]){
        for(String i : arrayName){
            System.out.println(i);
        }
    }
}
