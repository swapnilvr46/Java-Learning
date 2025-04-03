import java.util.Scanner;

public class Calculator {
    UserInput getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second number");
        int secondNumber = scanner.nextInt();
        System.out.println("which operation need to perform:  '+' ,'-' ,'*' ,'/' ");
        String operatationName = scanner.next();
        return new UserInput(firstNumber, secondNumber, operatationName);
    }

    void performOperation() {
        UserInput userInput = getInput();
        switch (userInput.operation) {
            case "+":
                System.out.println("Addition of Numbers: " + add(userInput.firstNumber, userInput.secondNumber));
                break;
            case "-":
                System.out.println("Subtration of Numbers: " + subtract(userInput.firstNumber, userInput.secondNumber));
                break;
            case "*":
                System.out.println("Multiplication of Numbers: " + multiply(userInput.firstNumber, userInput.secondNumber));
                break;
            case "/":
                if (userInput.secondNumber >= 1) {
                    System.out.println("Division of Numbers: " + division(userInput.firstNumber, userInput.secondNumber));
                    break;
                } else {
                    System.out.println("Division not divide by zero: ");
                }
            default:
                System.out.println("Invalid Operation");
                break;
        }
    }

    int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    int division(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.performOperation();
    }
}

class UserInput {
    int firstNumber;
    int secondNumber;
    String operation;

    UserInput(int firstNumber, int secondNumber, String operation) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operation = operation;
    }
}
