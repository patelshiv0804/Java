import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("choose the mathematical operation from following:");
            System.out.println("1. Sine");
            System.out.println("2. Cosine");
            System.out.println("3. Square Root");
            System.out.println("4. Tangent");
            System.out.println("5. Natural Logarithm (ln)");
            System.out.println("6. Power");
            System.out.println("7. Quit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter an angle in radians: ");
                    double angle = input.nextDouble();
                    double sineResult = Math.sin(angle);
                    System.out.println("Sine of " + angle + " radians is " + sineResult);
                    break;
                case 2:
                    System.out.print("Enter an angle in radians: ");
                    angle = input.nextDouble();
                    double cosineResult = Math.cos(angle);
                    System.out.println("Cosine of " + angle + " radians is " + cosineResult);
                    break;
                case 3:
                    System.out.print("Enter a number to calculate square root: ");
                    double number = input.nextDouble();
                    double sqrtResult = Math.sqrt(number);
                    System.out.println("Square root of " + number + " is " + sqrtResult);
                    break;
                case 4:
                    System.out.print("Enter an angle in radians: ");
                    angle = input.nextDouble();
                    double tangentResult = Math.tan(angle);
                    System.out.println("Tangent of " + angle + " radians is " + tangentResult);
                    break;
                case 5:
                    System.out.print("Enter a number to calculate natural logarithm (ln): ");
                    double num = input.nextDouble();
                    double lnResult = Math.log(num);
                    System.out.println("Natural logarithm of " + num + " is " + lnResult);
                    break;
                case 6:
                    System.out.print("Enter the base: ");
                    double base = input.nextDouble();
                    System.out.print("Enter the exponent: ");
                    double exponent = input.nextDouble();
                    double powerResult = Math.pow(base, exponent);
                    System.out.println(base + " raised to the power " + exponent + " is " + powerResult);
                    break;
                case 7:
                    System.out.println("Exiting the calculator. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
       
    }
}
