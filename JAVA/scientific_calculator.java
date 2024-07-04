// import java.util.Scanner;

// public class scientific_calculator {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("1:for addition");
//         System.out.println("2:for subtraction");
//         System.out.println("3:for multiplication");
//         System.out.println("4:for divison");
//         System.out.println("5:for square root");
//         System.out.println("6:for power");

//         System.out.println("enter your choice number:");
//         int number = sc.nextInt();

//         switch (number) {
//             case 1:
//                 System.out.print("Enter first number: ");
//                 int num1 = scanner.nextInt();
//                 System.out.print("Enter second number: ");
//                 int num2 = scanner.nextInt();
//                 result = num1 + num2;
//                 break;
//             case 2:
//                 System.out.print("Enter first number: ");
//                 num1 = scanner.nextInt();
//                 System.out.print("Enter second number: ");
//                 num2 = scanner.nextInt();
//                 result = num1 - num2;
//                 break;
//             case 3:
//                 System.out.print("Enter first number: ");
//                 num1 = scanner.nextInt();
//                 System.out.print("Enter second number: ");
//                 num2 = scanner.nextInt();
//                 result = num1 * num2;
//                 break;
//             case 4:
//                 System.out.print("Enter numerator: ");
//                 num1 = scanner.nextFloat();
//                 System.out.print("Enter denominator: ");
//                 num2 = scanner.nextFloat();
//                 if (num2 != 0) {
//                     result = num1 / num2;
//                 } else {
//                     System.out.println("Cannot divide by zero.");
//                     continue;
//                 }
//                 break;
//             case 5:
//                 System.out.print("Enter a number: ");
//                 int num1 = scanner.nextDouble();
//                 int squareRoot = Math.sqrt(number);
//                 System.out.println("Square root: " + squareRoot);
//                 break;
                
//         }
//         System.out.println("Result: " + result);
//     }
// }
import java.util.Scanner;

public class scientific_calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double result = 0.0;

        while (true) {
            System.out.println("Scientific Calculator Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square Root");
            System.out.println("6. Exponentiation");
            System.out.println("7. Quit");

            System.out.print("Enter your choice (1-7): ");
            int choice = input.nextInt();

            if (choice == 7) {
                System.out.println("Calculator is quitting. Goodbye!");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    double num1 = input.nextDouble();
                    System.out.print("Enter second number: ");
                    double num2 = input.nextDouble();
                    result = num1 + num2;
                    break;
                case 2:
                    System.out.print("Enter first number: ");
                    num1 = input.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = input.nextDouble();
                    result = num1 - num2;
                    break;
                case 3:
                    System.out.print("Enter first number: ");
                    num1 = input.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = input.nextDouble();
                    result = num1 * num2;
                    break;
                case 4:
                    System.out.print("Enter dividend: ");
                    num1 = input.nextDouble();
                    System.out.print("Enter divisor: ");
                    num2 = input.nextDouble();
                    if (num2 == 0) {
                        System.out.println("Division by zero is not allowed.");
                        continue;
                    }
                    result = num1 / num2;
                    break;
                case 5:
                    System.out.print("Enter a number: ");
                    num1 = input.nextDouble();
                    result = Math.sqrt(num1);
                    break;
                case 6:
                    System.out.print("Enter base: ");
                    num1 = input.nextDouble();
                    System.out.print("Enter exponent: ");
                    num2 = input.nextDouble();
                    result = Math.pow(num1, num2);
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    continue;
            }
            
            System.out.println("Result: " + result);
            break;
        }
        
    }
   
}