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
        show_inventory();
    }

    public static void employ(){

    }
    public static void show_employee(){
        int len = 1;
        System.out.println("Employee list: ");
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

    public static void show_inventory(){
        int len = 1;
        System.out.println("Inventory lists: \n \nBeers:");

        // for(int i = 0; i < beers.length; i++){
        //     if (beers[i] == null) {
        //         beers[i] = "No data";
        //     }
        // }
        // for (String i: beers) {
        //     System.out.println(len + ") " + i);
        //     len++;
        // }
        
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
