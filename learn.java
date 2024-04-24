import java.util.Scanner;

public class learn {

    public static void main(String[] args) {
        System.out.print("Hello World");
        
        System.out.println("Enter your age: ");
        Scanner scn = new Scanner(System.in); //Taking input from user
        int age = scn.nextInt();
        System.out.println(age);

        String status = (age >= 18) ? "Eligible" : "Not Eligible";
        System.out.println(status);
        
        int num = scn.nextInt();
        String statuss = (num %2== 0) ? "Positive" : "Not Positive";
        System.out.println(statuss);

    }
}


