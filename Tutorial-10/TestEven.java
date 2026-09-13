package tutorial10;
import java.util.Scanner;

import mod1.Even;

public class TestEven {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        if (Even.isEven(num)) {
            System.out.println(num + " is an even number.");
        } 
        else {
            System.out.println(num + " is a odd number.");
        }
    }
}