package tutorial5;

import java.util.Vector;

class RemoveVector {
    public static void main(String[] args) {

        Vector<String> colors = new Vector<String>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        // Remove Green
        colors.remove("Green");

        System.out.println("Final Vector:");

        for (String color : colors) {
            System.out.println(color);
        }
    }
}