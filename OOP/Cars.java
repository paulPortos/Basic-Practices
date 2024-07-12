package OOP;

public class Cars {
    String brandName;
    int yearReleased;
    double carPrice;
    public Cars(String brandName, int yearReleased, double carPrice){
        this.brandName = brandName;
        this.yearReleased = yearReleased;
        this.carPrice = carPrice;
    }
    public void showCars(){
        System.out.println("The car " + brandName + " is released on " + yearReleased + " and has a value of " + carPrice);
    }
}
