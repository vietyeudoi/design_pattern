package Builder;

public class Bedroom {
    private String roomID;
    private String bedType;
    private boolean hasBathroom;
    private boolean hasBalcony;
    private String color;
    private double sizeRoom;
    private boolean hasAirConditioner;
    private boolean hasTV;

    // Constructor nhận Builder
    public Bedroom(BedroomBuilder builder) {
        this.roomID = builder.roomID;
        this.bedType = builder.bedType;
        this.hasBathroom = builder.hasBathroom;
        this.hasBalcony = builder.hasBalcony;
        this.color = builder.color;
        this.sizeRoom = builder.sizeRoom;
        this.hasAirConditioner = builder.hasAirConditioner;
        this.hasTV = builder.hasTV;
    }

    @Override
    public String toString() {
        return "Bedroom {" +
                "\n  roomID='" + roomID + '\'' +
                ", \n  bedType='" + bedType + '\'' +
                ", \n  hasBathroom=" + hasBathroom +
                ", \n  hasBalcony=" + hasBalcony +
                ", \n  color='" + color + '\'' +
                ", \n  sizeRoom=" + sizeRoom +
                ", \n  hasAirConditioner=" + hasAirConditioner +
                ", \n  hasTV=" + hasTV +
                "\n}";
    }
}
