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
        // String day = "2"; 

        // switch (day) {
        //     case "1":
        //         System.out.println("Monday");
        //         break;
        //     case "2":
        //         System.out.println("Tuesday");
        //         break;
        //     case "3":
        //         System.out.println("Wednesday");
        //         break;
        //     default:
        //         System.out.println("Invalid day"); 
        // }
        // int[] ages = new int[3];
        // ages[0]=5;
        // ages[1]=10;
        // ages[2]=15;
        // int[] num = {1,2,3,4,5};
        // for(int i=0; i<num.length;i++){
        //     System.out.println(num[i]);
        // }
        //     for (int num: nums){
        //         System.out.println(num);
        //     }

            String str = "Divesh";
        // String str2 = new String("foundation");
           String str2 = "Jain";
            System.out.println(str);
            System.out.println(str2);
            System.out.println(str.concat(str2)); //concatenation
            System.out.println(str+str2); // adding or concatenation
            System.out.println(str.length()); // length of the string 
            System.out.println(str2.charAt(0)); // character at a particular index
            System.out.println(str.equals(str2)); //checks if it is equal
            System.out.println(str.equalsIgnoreCase(str2)); // ignores the equal
            System.out.println(str2.toLowerCase()); //lower case
            System.out.println(str2.toUpperCase()); //Upper case
            System.out.println(str2.trim()); //removes spaces
            System.out.println(str2.replaceFirst(str, str2)); //replaces only the first occurence 
            System.out.println(str2.replaceAll(str, str2)); //replaces all the occurence 
            System.out.println(str.substring(0,2));

            String str3 = "orange,apple,banana";
            String[] fruits = str3.split(",");
            System.out.println(fruits[0]);
            for (String fruit : fruits) {
                System.out.println(fruit);
            }

            int numerator = 10;
            int denominator = 0;

            try{
                int result = numerator/denominator;
                System.out.println("Result"+result);
            }
            catch(ArithmeticException e){
                System.out.println("Error: Division by zero");
                System.out.println(e.getMessage());
            }

            
            

        }
}

// public class ThrowThrows {

//     public static void validate(int age) {
//         if (age < 0) {
//             throw new IllegalArgumentException("Age cannot be negative");
//         }
//     }

//     public static void main(String[] args) {
//         try {
//             validate(-5);
//         } catch (IllegalArgumentException e) {
//             System.out.println(e.getMessage());
//         }
//     }
// }

public class ArrayList{
    public static void main(String[] args){

    }
}
