package tutorial6;

class Car {
    private String model = "Toyota";

    void showModel() {
        System.out.println("Car Model: " + model);
    }
}

class PrivateDemo {
    public static void main(String[] args) {

        Car c = new Car();

        c.showModel();
    }
}