import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num1, num2, result = 0;
        char operation;

        System.out.println("===== SIMPLE CALCULATOR =====");

        for(int i = 1; i <= 4; i++) {

       System.out.println("\n");

            System.out.print("Enter first number: ");
            num1 = sc.nextDouble();

            System.out.print("Enter second number: ");
            num2 = sc.nextDouble();

            System.out.print("Choose operation (+, -, *, /): ");
            operation = sc.next().charAt(0);

            switch(operation) {

                case '+':
                    result = num1 + num2;
                    System.out.println("Result = " + result);
                    break;

                case '-':
                    result = num1 - num2;
                    System.out.println("Result = " + result);
                    break;

                case '*':
                    result = num1 * num2;
                    System.out.println("Result = " + result);
                    break;

                case '/':
                    if(num2 == 0) {
                        System.out.println("Cannot divide by zero");
                    } else {
                        result = num1 / num2;
                        System.out.println("Result = " + result);
                    }
                    break;

                default:
                    System.out.println("Invalid operation");
            }
        }

        System.out.println("\nCalculator Closed");

        sc.close();
    }
}