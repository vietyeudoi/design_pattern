package structural.facade;

public class FlightBooking {
    public void bookFlight(String from, String to, String date) {
        System.out.println("Flight booked from " + from + " to " + to + " on " + date);
    }
    public void cancelFlight() {
        System.out.println("Flight cancelled.");
    }
}
