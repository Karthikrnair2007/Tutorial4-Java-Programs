package tutorial13;


abstract class Shape {
    abstract void numberOfSides();

    void sumOfAngles(int sides) {
        int sum = (sides - 2) * 180;
        System.out.println("Sum of angles: " + sum + " degrees");
    }
}

class Rectangle extends Shape {
    void numberOfSides() {
        System.out.println("Rectangle has 4 sides.");
        sumOfAngles(4);
    }
}

class Triangle extends Shape {
    void numberOfSides() {
        System.out.println("Triangle has 3 sides.");
        sumOfAngles(3);
    }
}

class Hexagon extends Shape {
    void numberOfSides() {
        System.out.println("Hexagon has 6 sides.");
        sumOfAngles(6);
    }
}

class ShapeDemo {
    public static void main(String[] args) {
        Shape r = new Rectangle();
        Shape t = new Triangle();
        Shape h = new Hexagon();

        r.numberOfSides();
        t.numberOfSides();
        h.numberOfSides();
    }
}
