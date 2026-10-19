package tutorial12;

import java.util.Scanner;

class InvalidReservationException extends Exception {
    InvalidReservationException(String message) {
        super(message);
    }
}

class HotelRoom {
    int availableSlots = 10;

    void reserve(int slots) throws InvalidReservationException {
        if (slots <= 0) {
            throw new InvalidReservationException(
                "Number of slots must be positive!"
            );
        }

        if (slots > availableSlots) {
            System.out.println("Not enough slots available!");
        } else {
            availableSlots = availableSlots - slots;
            System.out.println("Reservation successful!");
            System.out.println("Remaining slots: " + availableSlots);
        }
    }
}

class HotelReservation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HotelRoom hotel = new HotelRoom();

        System.out.print("Enter number of slots to reserve: ");
        int slots = sc.nextInt();

        try {
            hotel.reserve(slots);
        } catch (InvalidReservationException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}