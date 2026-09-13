package tutorial10;


import mod1.Man;
import tutorial2.Woman;

public class Main {
    public static void main(String[] args) {
        Man man = new Man("Smith", 40);
        Woman woman = new Woman("Jane", 35);

       man.displayMe();
       woman.displayMe();
    }
}