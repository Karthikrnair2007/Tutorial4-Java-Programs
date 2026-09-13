package tutorial6;


import tutorial5.Employee;

class Manager extends Employee {

    void displaySalary() {
        // Accessing protected variable
        System.out.println("Salary: " + salary);

        // Accessing protected method
        showSalary();
    }

    public static void main(String[] args) {

        Manager m = new Manager();

        m.displaySalary();
    }
}