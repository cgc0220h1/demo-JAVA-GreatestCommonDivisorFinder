import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isValid = false;
        int num1;
        int num2;

        do {
            System.out.print("Enter first number: ");
            num1 = scanner.nextInt();
            System.out.println();
            System.out.print("Enter second number: ");
            num2 = scanner.nextInt();
            System.out.println();
            if (num1 == 0 || num2 == 0) {
                System.out.println("No greatest common divisor found!. Please enter number again");
            } else {
                isValid = true;
            }
        } while (!isValid);

        int num1Display = num1;
        int num2Display = num2;
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);

        if (isValid) {
            while (num1 != num2) {
                if (num1 > num2) {
                    num1 = num1 - num2;
                } else {
                    num2 = num2 - num1;
                }
            }
        }

        System.out.printf("Greatest common Divisor of %d and %d is %d",num1Display,num2Display,num1);
    }
}
