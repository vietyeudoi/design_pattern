package Factory_Method;

class ChocolateCandyFactory extends CandyFactory {
    @Override
    public Candy createCandy() {
        return new ChocolateCandy();
    }
}


