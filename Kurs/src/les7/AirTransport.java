package les7;

public abstract class AirTransport extends Transport {
    private int Wingspan;
    private int MinimumRunwayLengthForTakeoff;

    public AirTransport(int power, int maximumSpeed, int weight, String brand, int wingspan, int minimumRunwayLengthForTakeoff) {
        super(power, maximumSpeed, weight, brand);
        Wingspan = wingspan;
        MinimumRunwayLengthForTakeoff = minimumRunwayLengthForTakeoff;
    }

    public AirTransport(int power, int maximumSpeed, int weight, String brand) {
        super(power, maximumSpeed, weight, brand);
    }

    public int getWingspan() {
        return Wingspan;
    }

    public void setWingspan(int wingspan) {
        Wingspan = wingspan;
    }

    public int getMinimumRunwayLengthForTakeoff() {
        return MinimumRunwayLengthForTakeoff;
    }

    public void setMinimumRunwayLengthForTakeoff(int minimumRunwayLengthForTakeoff) {
        MinimumRunwayLengthForTakeoff = minimumRunwayLengthForTakeoff;
    }
}
