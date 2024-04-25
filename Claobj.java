public class Claobj {
    public static void main(String[] args) {
    
        Car c1 = new Car();
    }
}
class Car{
    //instance variables
    String brand;
    int year;

    //methods
    void display(){
        System.out.println(brand+ " " + year);
    }
}
