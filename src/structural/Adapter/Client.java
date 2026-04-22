package structural.Adapter;

import structural.Adapter.lib.UKCarPriceCalculator;

public class Client {
    public static void main(String[] args) {
        // Sử dụng các calculator chuẩn
        PriceCalculator carPrice = new CarPriceCalculator();
        PriceCalculator truckPrice = new TruckPriceCalculator();

        // Sử dụng Adapter cho UK Calculator
        UKCarPriceCalculator ukCalculator = new UKCarPriceCalculator();
        PriceCalculator ukPriceAdapter = new UKPriceAdapter(ukCalculator);

        // Client gọi chung 1 phương thức calculatePrice()
        System.out.println("Car Price: " + carPrice.calculatePrice());
        System.out.println("Truck Price: " + truckPrice.calculatePrice());
        System.out.println("UK Car Price (Adapted): " + ukPriceAdapter.calculatePrice());
    }
}
