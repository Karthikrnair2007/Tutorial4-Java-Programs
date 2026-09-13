package tutorial8;

class Bird {
    void fly() {
        System.out.println("Bird flies in the sky.");
    }
}

class Sparrow extends Bird {
    @Override
    void fly() {
        System.out.println("Sparrow flies short distances.");
    }
}

class Eagle extends Bird {
    @Override
    void fly() {
        System.out.println("Eagle soars high in the sky.");
    }
}

class BirdDemo {
    public static void main(String[] args) {

        Bird[] birds = new Bird[3];

        birds[0] = new Bird();
        birds[1] = new Sparrow();
        birds[2] = new Eagle();

        for (Bird bird : birds) {
            bird.fly();
        }
    }
}