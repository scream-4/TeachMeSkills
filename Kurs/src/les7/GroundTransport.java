package les7;

public abstract class GroundTransport extends Transport {
    private int NumberOfWheels;
    private int FuelConsumption;

    public GroundTransport(int power, int maximumSpeed, int weight, String brand, int numberOfWheels, int fuelConsumption) {
        super(power, maximumSpeed, weight, brand);
        NumberOfWheels = numberOfWheels;
        FuelConsumption = fuelConsumption;
    }

    public int getNumberOfWheels() {
        return NumberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        NumberOfWheels = numberOfWheels;
    }

    public int getFuelConsumption() {
        return FuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        FuelConsumption = fuelConsumption;
    }
}
