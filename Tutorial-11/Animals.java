package tutorial11;

abstract class Animal {
    protected int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }

    public void walk() {
        System.out.println("This animal walks on " + legs + " legs.");
    }

    public abstract void eat();
}

interface Pet {
    String getName();
    void setName(String name);
    void play();
}

class Spider extends Animal {
    public Spider() {
        super(8);
    }

    public void eat() {
        System.out.println("The spider eats insects.");
    }
}

class Cat extends Animal implements Pet {
    private String name;

    public Cat(String name) {
        super(4);
        this.name = name;
    }

    public Cat() {
        this("");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println(name + " likes to play with balls of yarn.");
    }

    public void eat() {
        System.out.println(name + " eats fish and cat food.");
    }
}

class Fish extends Animal implements Pet {
    private String name;

    public Fish() {
        super(0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println(name + " swims around playfully.");
    }

    public void walk() {
        System.out.println("Fish cannot walk; they swim.");
    }

    public void eat() {
        System.out.println(name + " eats pond flakes.");
    }
}

public class Animals {
    public static void main(String[] args) {
        Fish fish = new Fish();
        fish.setName("Nemo");
        System.out.println("Fish's name: " + fish.getName());
        fish.play();
        fish.walk();
        fish.eat();

        System.out.println();

        Cat cat = new Cat("Fluffy");
        System.out.println("Cat's name: " + cat.getName());
        cat.play();
        cat.walk();
        cat.eat();

        System.out.println();

        Spider spider = new Spider();
        spider.walk();
        spider.eat();
    }
}