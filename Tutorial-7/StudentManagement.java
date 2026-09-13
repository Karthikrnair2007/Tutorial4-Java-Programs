package tutorial7;

import java.util.Scanner;

class Students {
    String name;
    int rollNo;
    String course;

    void setDetails(String name, int rollNo, String course) {
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }
}

class StudentAccount extends Students {
    double collegeFee;

    void setCollegeFee(double collegeFee) {
        this.collegeFee = collegeFee;
    }

    void displayCollegeFee() {
        System.out.println("College Fee: " + collegeFee);
    }
}

class Hosteller extends StudentAccount {
    double hostelFee;
    double messFee;

    void setFees(double hostelFee, double messFee) {
        this.hostelFee = hostelFee;
        this.messFee = messFee;
    }

    void displayDetails() {
        System.out.println("\n--- HOSTELLER DETAILS ---");
        super.displayDetails();
        System.out.println("College Fee: " + collegeFee);
        System.out.println("Hostel Fee: " + hostelFee);
        System.out.println("Mess Fee: " + messFee);

        double total = collegeFee + hostelFee + messFee;
        System.out.println("Total Fee: " + total);
    }
}

class DayScholar extends StudentAccount {
    double busFee;

    void setBusFee(double busFee) {
        this.busFee = busFee;
    }

    void displayDetails() {
        System.out.println("\n--- DAY SCHOLAR DETAILS ---");
        super.displayDetails();
        System.out.println("College Fee: " + collegeFee);
        System.out.println("Bus Fee: " + busFee);

        double total = collegeFee + busFee;
        System.out.println("Total Fee: " + total);
    }
}

class StudentManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Hosteller
        Hosteller hosteller = new Hosteller();

        System.out.print("Enter Hosteller's Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll No: ");
        int rollNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        System.out.print("Enter College Fee: ");
        double collegeFee = sc.nextDouble();

        System.out.print("Enter Hostel Fee: ");
        double hostelFee = sc.nextDouble();

        System.out.print("Enter Mess Fee: ");
        double messFee = sc.nextDouble();

        hosteller.setDetails(name, rollNo, course);
        hosteller.setCollegeFee(collegeFee);
        hosteller.setFees(hostelFee, messFee);

        // Day Scholar
        sc.nextLine();

        DayScholar dayScholar = new DayScholar();

        System.out.print("\nEnter Day Scholar's Name: ");
        name = sc.nextLine();

        System.out.print("Enter Roll No: ");
        rollNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Course: ");
        course = sc.nextLine();

        System.out.print("Enter College Fee: ");
        collegeFee = sc.nextDouble();

        System.out.print("Enter Bus Fee: ");
        double busFee = sc.nextDouble();

        dayScholar.setDetails(name, rollNo, course);
        dayScholar.setCollegeFee(collegeFee);
        dayScholar.setBusFee(busFee);

        // Display details
        hosteller.displayDetails();
        dayScholar.displayDetails();

        sc.close();
    }
}