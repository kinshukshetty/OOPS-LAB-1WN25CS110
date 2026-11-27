import java.util.InputMismatchException;
import java.util.Scanner;

class SeatAlreadyBookedException extends Exception {
    public SeatAlreadyBookedException(String message) {
        super(message);
    }
}

class Reservation {
    boolean[] seats;
    int totalSeats;

    public Reservation(int totalSeats) {
        this.totalSeats = totalSeats;
        this.seats = new boolean[totalSeats];
    }

    public void reserveSeat(int seatNumber) throws SeatAlreadyBookedException {
        if (seatNumber < 1 || seatNumber > totalSeats) {
            throw new IllegalArgumentException("Invalid seat number! Please enter a number between 1 and " + totalSeats + ".");
        }

        if (seats[seatNumber - 1]) {
            throw new SeatAlreadyBookedException("Seat number " + seatNumber + " is already booked.");
        }

        seats[seatNumber - 1] = true;
        System.out.println("Success! Seat number " + seatNumber + " has been reserved.");
    }

    public void displaySeats() {
        System.out.print("Seat Status- \n");
        for (int i = 0; i < totalSeats; i++) {
            System.out.print("[seat " + (i + 1) + "]:" + (seats[i] ? "Booked" : "Available") );
            System.out.println(1);
        }
        
    }
}


public class RailwayReservationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Reservation trainCoach = new Reservation(5);
        boolean exit = false;
        boolean booked=false;
        System.out.println("=== Railway Reservation Management System ===");

        while (!exit) {
            trainCoach.displaySeats();
            System.out.print("\nEnter seat number to book (1-5) or 0 to exit: ");

            try {
                int seatChoice = scanner.nextInt();

                if (seatChoice == 0) {
                    exit = true;
                    System.out.println("Exiting system...");
                    continue;
                }

                
                trainCoach.reserveSeat(seatChoice);

            } catch (SeatAlreadyBookedException e) {
                System.out.println("Booking Failed: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid Selection: " + e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Input Error: Please enter a valid integer for the seat number.");
                scanner.next();
            } finally {
                if (booked) {
                    System.out.println("Status: Transaction completed.\n---------------------------------------------");
                }
                else{
                    System.out.println("Status: Transaction failed.\n---------------------------------------------");
                }
            }
        }

        scanner.close();
    }
}