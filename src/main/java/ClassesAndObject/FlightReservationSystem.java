package ClassesAndObject;


import java.util.Random;

public class FlightReservationSystem {
    final static String FLIGHT_RESEVATION= "Trip";

    public FlightReservationSystem(String flightNumber, double flightArrival, double flightDeparture, String destination, int seatsAvailable) {
        this.flightNumber = flightNumber;
        this.flightArrival = flightArrival;
        this.flightDeparture = flightDeparture;
        this.destination = destination;
        this.seatsAvailable = seatsAvailable;
    }

    public FlightReservationSystem(String flightNumber) {
        this(flightNumber, 00.00, 00.00, "Unknown", 0);
    }

    String flightNumber;
    double flightArrival;
    double flightDeparture;
    String destination;
    int seatsAvailable;

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public double getFlightArrival() {
        return flightArrival;
    }

    public void setFlightArrival(double flightArrival) {
        this.flightArrival = flightArrival;
    }

    public double getFlightDeparture() {
        return flightDeparture;
    }

    public void setFlightDeparture(double flightDeparture) {
        this.flightDeparture = flightDeparture;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getSeatsAvailable() {
        return seatsAvailable;
    }

    public void setSeatsAvailable(int seatsAvailable) {
        this.seatsAvailable = seatsAvailable;
    }

    String checkAvialbeSeats(String flightNumber, int seatAToBook) {
        if (seatsAvailable == 0) {
            System.out.println(seatsAvailable + " No seat available");
            return "No confirmation";
        } else if (seatsAvailable < seatAToBook) {
            System.out.println("NO seats available");
            return "No confirmation on seats";
        }
        System.out.println("Your booking has confirmed on the: " + flightNumber);
        seatsAvailable -= seatAToBook;
        return getConfirmationNumber();
    }

    String cancelBooking(String flightNumber, int seatsToCancel) {
        System.out.println("your booking has been canceled: " + flightNumber);
        seatsAvailable += seatsToCancel;
        return getConfirmationNumber();
    }

    void displayFlightDetail() {
        String flightDetails = " Flight number is: " + flightNumber + "\n The flight departure time " +
                flightDeparture + "\n The flight arrival time is: " +
                flightArrival + "\n The the destination is: " +
                destination + "\n The seats available: " + seatsAvailable;
        System.out.println(flightDetails);
    }

    String getConfirmationNumber() {
        Random random = new Random();
        return "Confirmation " + random.nextInt(9999);
    }

    public static void main(String[] args) {
        FlightReservationSystem trip = new FlightReservationSystem("019",12.23,20.45,"Chicago",100);
        trip.displayFlightDetail();
        String confirmation = trip.checkAvialbeSeats(trip.flightNumber, 8);
        System.out.println(confirmation);
        System.out.println(trip.seatsAvailable+" Seats left");
    }



}
