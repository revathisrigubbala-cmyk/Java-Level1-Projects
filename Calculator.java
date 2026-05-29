import java.util.Scanner;

public class CalculatorApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char choice;

        do {

            System.out.println("======================================");
            System.out.println("        JAVA CALCULATOR APPLICATION   ");
            System.out.println("======================================");

            System.out.println("\n------------- MENU ----------------");

            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");

            System.out.println("------------------------------------");

            System.out.print("Enter Your Choice (1-4): ");
            int option = sc.nextInt();

            System.out.print("Enter First Number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter Second Number: ");
            double num2 = sc.nextDouble();

            double result;

            System.out.println("\n=========== RESULT ===========");

            switch(option) {

                case 1:
                    result = num1 + num2;
                    System.out.println("Addition Result = " + result);
                    break;

                case 2:
                    result = num1 - num2;
                    System.out.println("Subtraction Result = " + result);
                    break;

                case 3:
                    result = num1 * num2;
                    System.out.println("Multiplication Result = " + result);
                    break;

                case 4:
                    if(num2 == 0) {
                        System.out.println("Cannot divide by zero!");
                    } else {
                        result = num1 / num2;
                        System.out.println("Division Result = " + result);
                    }
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

            System.out.println("================================");

            System.out.print("\nDo You Want To Continue? (y/n): ");
            choice = sc.next().charAt(0);

            System.out.println();

        } while(choice == 'y' || choice == 'Y');

        System.out.println("Calculator Closed Successfully.");

        sc.close();
    }
}