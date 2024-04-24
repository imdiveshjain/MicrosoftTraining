import java.util.Scanner;

public class learn {

    public static void main(String[] args) {
        System.out.println("Hello World"); // Changed print to println for newline
        
        // Uncomment the following code if you want to take input from the user
        // System.out.println("Enter your age: ");
        // Scanner scn = new Scanner(System.in);
        // int age = scn.nextInt();
        // System.out.println(age);

        // String status = (age >= 18) ? "Eligible" : "Not Eligible";
        // System.out.println(status);
        
        // int num = scn.nextInt();
        // String statuss = (num %2== 0) ? "Positive" : "Not Positive";
        // System.out.println(statuss);

        // int sum = 0;
        // for (int i = 1; i <= 10; i++) {
        //     if(i==5){
        //         break; //prints till the current iteration
        //     }
        //     if(i==6){
        //         continue; //Skips the current iteration
        //     }
        //         sum += i; 
        //     }
        // System.out.println("Sum of numbers from 1 to 10: " + sum);
        
        // Initialize the day variable before using it
        String day = "2"; 

        switch (day) {
            case "1":
                System.out.println("Monday");
                break;
            case "2":
                System.out.println("Tuesday");
                break;
            case "3":
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day"); 
        }
    }
}
