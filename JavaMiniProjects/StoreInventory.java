package JavaMiniProjects;

public class StoreInventory {
    //Here are the employee's data 
    static String [] employee = new String[10];
    static String [] address = new String[10];
    static String [] past_Job = new String[10];
    //This are the inventory section and their respective prices

    //Beers
    static String [] beers = new String[10];
    static int [] beers_Price = new int[10];
    //Snacks
    static String [] snacks = new String[10];
    static int [] snack_Price = new int[10];
    public static void main(String[] args) {
        show_employee();
    }
    
    //To be continued
    //Change the element of the array based on the no data value

    public static void employ(){
        //int x = 0;
        for(String i: employee){
            if (i.equals("No data") || i.equals(null)){
                
            }
        }
    }

    /*This function shows every elements of the array of employee list */
    //Done
    public static void show_employee(){
        int len = 1;
        System.out.println("Employee list: ");
        /*This function checks if an element of the array is null, if its true then it will change the value to No data*/
        for(int i = 0; i < employee.length; i++){
            if (employee[i] == null) {
                employee[i] = "No data";
            }
        }
        for(String i: employee){
            System.out.println(len + ") " + i);
            len++;
        }
    }

    /*This function prints every elements of the array of the inventory including beers and snacks it also changes the keyword null to no price keyword */

    //Done 
    public static void show_inventory(){
        int len = 1;
        System.out.println("Inventory lists: \n \nBeers:");

        for(int i = 0; i < beers.length; i++){
            if (beers[i] == null) {
                beers[i] = "No data";
            }
        }
        for(int i = 0; i < beers.length || i < beers_Price.length; i++){
            if (beers_Price[i] == 0){
                System.out.println(len + ") " + beers[i] + "(No price)");
            } else {
                System.out.println(len + ") " + beers[i] + beers_Price[i]);
            }
        }
        
        len = 1;
        System.out.println("\nSnacks: \n");
        for(int i = 0; i < snacks.length; i++){
            if (snacks[i] == null) {
                snacks[i] = "No data";
            }
        }
        for(int i = 0; i < snacks.length || i < snack_Price.length; i++){
            if (snack_Price[i] == 0){
                System.out.println(len + ") " + snacks[i] + "(No price)");
            } else {
                System.out.println(len + ") " + snacks[i] + snack_Price[i]);
            }
        }
    }
}
