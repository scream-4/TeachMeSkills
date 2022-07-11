package les7;

public abstract class Transport {
    private int Power;
    private int MaximumSpeed;
    private int Weight;
    private String Brand;

    public Transport(int power, int maximumSpeed, int weight, String brand) {
        Power = power;
        MaximumSpeed = maximumSpeed;
        Weight = weight;
        Brand = brand;
    }

    public int getPower() {
        return Power;
    }

    public void setPower(int power) {
        Power = power;
    }

    public int getMaximumSpeed() {
        return MaximumSpeed;
    }

    public void setMaximumSpeed(int maximumSpeed) {
        MaximumSpeed = maximumSpeed;
    }

    public int getWeight() {
        return Weight;
    }

    public void setWeight(int weight) {
        Weight = weight;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public abstract void PrintInfo();
}
