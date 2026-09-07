package tutorial5;

import java.util.Vector;

class VectorSum {
    public static void main(String[] args) {

        Vector<Integer> numbers = new Vector<Integer>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        int sum = 0;

        for (int number : numbers) {
            sum = sum + number;
        }

        System.out.println("Sum = " + sum);
    }
}