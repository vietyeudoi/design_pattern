package structural.Adapter;

import structural.Adapter.lib.UKCarPriceCalculator;

public class UKPriceAdapter implements PriceCalculator {
    private final UKCarPriceCalculator ukCalculator;
    private static final float EXCHANGE_RATE = 1.3f;

    public UKPriceAdapter(UKCarPriceCalculator ukCalculator) {
        this.ukCalculator = ukCalculator;
    }

    @Override
    public float calculatePrice() {
        return ukCalculator.getPrice() * EXCHANGE_RATE;
    }
}
