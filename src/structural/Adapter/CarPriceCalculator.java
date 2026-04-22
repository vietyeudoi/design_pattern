package structural.Adapter;

public class CarPriceCalculator implements PriceCalculator {
    @Override
    public float calculatePrice() {
        return 3.6f;
    }
}
