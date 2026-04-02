package Factory_Method;

class CaramelCandyFactory extends CandyFactory {
    @Override
    public Candy createCandy() {
        return new CaramelCandy();
    }
}
