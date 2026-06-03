import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;
        double num1, num2, result;
        char continueChoice;

        do {

            System.out.println("=================================================");
            System.out.println("           JAVA CALCULATOR APPLICATION           ");
            System.out.println("=================================================");

            System.out.println("\n---------------- MENU ----------------");

            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");

            System.out.println("--------------------------------------");

            System.out.print("Enter Your Choice (1-4): ");
            choice = sc.nextInt();

            System.out.print("Enter First Number: ");
            num1 = sc.nextDouble();

            System.out.print("Enter Second Number: ");
            num2 = sc.nextDouble();

            System.out.println("\n========== RESULT ==========");

            switch(choice) {

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
                        System.out.println("Error! Division by zero not allowed.");
                    } else {
                        result = num1 / num2;
                        System.out.println("Division Result = " + result);
                    }
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

            System.out.println("======================================");

            System.out.print("\nDo You Want To Continue? (y/n): ");
            continueChoice = sc.next().charAt(0);

            System.out.println();

        } while(continueChoice == 'y' || continueChoice == 'Y');

        System.out.println("Thank You For Using Java Calculator. Goodbye!");

        sc.close();
    }
}