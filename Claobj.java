public class Claobj {
    public static void main(String[] args) {
    
        Car c1 = new Car();
        // c1.brand = "Toyota";
        // c1.year = 2024;

        // System.out.println(c1.brand);
        // System.out.println(c1.year);
        
        // c1.display();

        Car c2 = new Car("Toyota",2024);
        c2.display();
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

    public Car(){
        brand = "Unknown";
        year = 0;
    }
    
    public Car(String brand, int year){
        this.brand=brand;
        this.year=year;
    }
    

}
