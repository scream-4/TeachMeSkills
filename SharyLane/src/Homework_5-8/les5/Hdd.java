package les5;

public class Hdd {
    private String title;
    private int amount;
    private String type;

    public Hdd() {
    }

    public Hdd(String title, int amount, String type) {
        this.title = title;
        this.amount = amount;
        this.type = type;
    }

    public String getHddInfo() {
        return "\nHDD title: " + title + "\nHDD amount: " + amount + "\nHdd type: " + type;
    }
}
