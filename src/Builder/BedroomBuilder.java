package Builder;

public class BedroomBuilder {
    String roomID;
    String bedType;
    boolean hasBathroom;
    boolean hasBalcony;
    String color;
    double sizeRoom;
    boolean hasAirConditioner;
    boolean hasTV;

    public BedroomBuilder(String roomID, String bedType) {
        this.roomID = roomID;
        this.bedType = bedType;
        // Default values cho các trường optional
        this.hasBathroom = false;
        this.hasBalcony = false;
        this.color = "White";
        this.sizeRoom = 20.0;
        this.hasAirConditioner = false;
        this.hasTV = false;
    }

    public BedroomBuilder withHasBathroom(boolean hbr) {
        this.hasBathroom = hbr;
        return this;
    }

    public BedroomBuilder withHasBalcony(boolean hb) {
        this.hasBalcony = hb;
        return this;
    }

    public BedroomBuilder withColor(String color) {
        this.color = color;
        return this;
    }

    public BedroomBuilder withSizeRoom(double sr) {
        this.sizeRoom = sr;
        return this;
    }

    public BedroomBuilder withHasAirConditioner(boolean hac) {
        this.hasAirConditioner = hac;
        return this;
    }

    public BedroomBuilder withHasTV(boolean htv) {
        this.hasTV = htv;
        return this;
    }

    public Bedroom build() {
        return new Bedroom(this);
    }
}
