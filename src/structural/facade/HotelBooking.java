package structural.facade;

public class HotelBooking {
    public void bookRoom(String hotel, String checkIn, String checkOut) {
        System.out.println("Hotel room booked at " + hotel
                + " from " + checkIn + " to " + checkOut);
    }
    public void cancelRoom() {
        System.out.println("Hotel booking cancelled.");
    }
}
