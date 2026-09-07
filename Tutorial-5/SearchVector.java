package tutorial5;

import java.util.Vector;
import java.util.Scanner;

class SearchVector {
    public static void main(String[] args) {

        Vector<String> items = new Vector<String>();

        items.add("Pen");
        items.add("Notebook");
        items.add("Eraser");
        items.add("Marker");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter item name: ");
        String item = sc.nextLine();

        if (items.contains(item)) {
            System.out.println("Item found");
        } else {
            System.out.println("Item not found");
        }

        sc.close();
    }
}