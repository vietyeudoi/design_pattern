package structural.facade;

public class CarRental {
    public void reserveCar(String destination, String date) {
        System.out.println("Car rental reserved to " + destination + " on " + date);
    }
    public void cancelCar() {
        System.out.println("Car rental cancelled.");
    }
}