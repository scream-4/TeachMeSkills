package les5;

public class Computer {
    private int price;
    private String model;
    private Ram ram;
    private Hdd hdd;

    public Computer(int price, String model) {
        this.price = price;
        this.model = model;
        this.ram = new Ram();
        this.hdd = new Hdd();
    }

    public Computer(int price, String model, String ramTitle, int ramAmount, String hddTitle, int hddAmount, String hddType) {
        this.price = price;
        this.model = model;
        this.ram = new Ram(ramTitle, ramAmount);
        this.hdd = new Hdd(hddTitle, hddAmount, hddType);
    }

    public String getInfo() {
        return "Price: " + price + "\nModel: " + model + ram.printRamInfo() + hdd.getHddInfo();
    }
}
