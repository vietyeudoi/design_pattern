package structural.facade;

public class VacationFacade {

    private CarRental    carRental;
    private HotelBooking hotelBooking;
    private FlightBooking flightBooking;

    public VacationFacade() {
        this.carRental    = new CarRental();
        this.hotelBooking = new HotelBooking();
        this.flightBooking = new FlightBooking();
    }

    // One unified call replaces three separate calls
    public void bookVacation(String origin, String destination,
                             String travelDate, String hotel,
                             String checkIn, String checkOut) {
        System.out.println("=== Booking your vacation ===");
        flightBooking.bookFlight(origin, destination, travelDate);
        hotelBooking.bookRoom(hotel, checkIn, checkOut);
        carRental.reserveCar(destination, checkIn);
        System.out.println("=== Vacation booked successfully! ===");
    }

    public void cancelVacation() {
        System.out.println("=== Cancelling your vacation ===");
        flightBooking.cancelFlight();
        hotelBooking.cancelRoom();
        carRental.cancelCar();
        System.out.println("=== Vacation cancelled. ===");
    }
}
