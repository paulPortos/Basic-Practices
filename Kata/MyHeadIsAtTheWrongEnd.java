package Kata;

public class MyHeadIsAtTheWrongEnd {
    public static void main(String[] args) {
        example1();
    }

    public static void example1(){
        String [] animal = {"Head", "Tail", "Body" };
        System.out.println("Old Arrangement: ");
        for(String x: animal){
            System.out.println(x);
        }
        String[] rearrangedAnimal = new String[animal.length];
        for(int i = 0; i < animal.length; i++){
            String k = animal[i];
            switch (animal[i]) {
                case "Tail":
                    rearrangedAnimal[0] = k; 
                    break;
                case "Body":
                    rearrangedAnimal[1] = k; 
                    break;
                case "Head":
                    rearrangedAnimal[2] = k; 
                    break;
            }
        }
        System.out.println("New arrangement:");
        for(String o: rearrangedAnimal){
            System.out.println(o);
        }
    }
}
