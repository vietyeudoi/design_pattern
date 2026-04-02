package Factory_Method;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        CandyFactory factory = null;
        List<Candy> storeCandies = new ArrayList<Candy>();

        factory = new ChocolateCandyFactory();
        storeCandies.add(factory.createCandy());

        factory = new CaramelCandyFactory();
        storeCandies.add(factory.createCandy());

        for (Candy c : storeCandies) {
            c.displayInfo();
        }
    }
}

