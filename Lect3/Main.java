
import java.util.Scanner;

class Programs {
    private int inputNumber;

    // Constructor to initialize the inputNumber
    public Programs(int inputNumber) {
        this.inputNumber = inputNumber;
    }

    // Getter and Setter for inputNumber
    public int getInputNumber() {
        return inputNumber;
    }

    public void setInputNumber(int inputNumber) {
        this.inputNumber = inputNumber;
    }

    // Function to check and display if the number is even or odd
    public void checkEvenOrOdd() {
        if (inputNumber % 2 == 0) {
            System.out.println(inputNumber + " is even.");
        } else {
            System.out.println(inputNumber + " is odd.");
        }
    }

    // Function to compute the factorial of the number
    public void computeFactorial() {
        int factorial = 1;
        for (int i = 1; i <= inputNumber; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + inputNumber + " is: " + factorial);
    }

    // Function to check and display if the number is prime
    public void checkPrime() {
        boolean isPrime = true;
        if (inputNumber <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(inputNumber); i++) {
                if (inputNumber % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(inputNumber + " is prime.");
        } else {
            System.out.println(inputNumber + " is not prime.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user using JOptionPane (not implemented for simplicity)
        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();

        Programs program = new Programs(userInput);

        // Menu
        System.out.println("********** MENU **********");
        System.out.println("Press 1 to check whether the Number is even or odd");
        System.out.println("Press 2 to find the factorial of a Number");
        System.out.println("Press 3 to check whether the Number is Prime or Not");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        // Switch case to call respective functions
        switch (choice) {
            case 1:
                program.checkEvenOrOdd();
                break;
            case 2:
                program.computeFactorial();
                break;
            case 3:
                program.checkPrime();
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}
