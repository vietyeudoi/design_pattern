package structural.Adapter;

public class TruckPriceCalculator implements PriceCalculator {
    @Override
    public float calculatePrice() {
        return 10.36f;
    }
}
