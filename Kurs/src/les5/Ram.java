package les5;

public class Ram {
    private String title;
    private int amount;

    public Ram() {

    }
    public Ram(String title, int amount) {
        this.title = title;
        this.amount = amount;
    }

    public String printRamInfo() {
        return "\nRam title: " + title + "\nRam amount: " + amount;
    }
}
