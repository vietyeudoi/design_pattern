package structural.facade;

// Main.java
public class Client {
    public static void main(String[] args) {

        // --- WITHOUT Façade (complex, many calls) ---
        FlightBooking flight = new FlightBooking();
        HotelBooking  hotel  = new HotelBooking();
        CarRental     car    = new CarRental();

        flight.bookFlight("Hanoi", "Paris", "2025-06-01");
        hotel.bookRoom("Hotel Lumière", "2025-06-01", "2025-06-07");
        car.reserveCar("Paris", "2025-06-01");

        // --- WITH Façade (simple, one call) ---
        VacationFacade vacation = new VacationFacade();
        vacation.bookVacation(
                "Hanoi", "Paris",
                "2025-06-01",
                "Hotel Lumière",
                "2025-06-01", "2025-06-07"
        );
        vacation.cancelVacation();
    }
}
