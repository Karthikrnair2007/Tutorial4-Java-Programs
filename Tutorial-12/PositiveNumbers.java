package tutorial12;

import java.util.Scanner;

class InvalidNumberException extends Exception {
    InvalidNumberException(String message) {
        super(message);
    }
}

class PositiveNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int sum = 0;

        try {
            for (int i = 1; i <= n; i++) {
                System.out.print("Enter number " + i + ": ");
                int num = sc.nextInt();

                if (num <= 0) {
                    throw new InvalidNumberException(
                        "Number must be positive!"
                    );
                }

                sum = sum + num;
            }

            double average = (double) sum / n;

            System.out.println("Sum = " + sum);
            System.out.println("Average = " + average);

        } catch (InvalidNumberException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}