package Builder;

public class Client {
    public static void main(String[] args) {
        System.out.println("=== Creating Bedroom using Builder Pattern ===\n");

        Bedroom simpleRoom = new BedroomBuilder("R101", "King")
                .build();

        Bedroom luxuryRoom = new BedroomBuilder("R202", "Queen")
                .withHasBathroom(true)
                .withHasBalcony(true)
                .withColor("Beige")
                .withSizeRoom(35.5)
                .withHasAirConditioner(true)
                .withHasTV(true)
                .build();

        System.out.println("Simple Room:");
        System.out.println(simpleRoom);

        System.out.println("\nLuxury Room:");
        System.out.println(luxuryRoom);
    }
}
