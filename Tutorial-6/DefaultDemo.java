package tutorial6;

class Animal {
    String species = "Dog";

    void showSpecies() {
        System.out.println("Species: " + species);
    }
}

class DefaultDemo {
    public static void main(String[] args) {

        Animal a = new Animal();

        // Direct access is allowed
        System.out.println("Species: " + a.species);
    }
}