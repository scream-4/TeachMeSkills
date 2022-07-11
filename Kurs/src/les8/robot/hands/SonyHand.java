package les8.robot.hands;

public class SonyHand implements IHand {
    private int price;

    public SonyHand(int price) {
        this.price = price;
    }

    public SonyHand() {
    }

    @Override
    public void upHand() {
        System.out.println("Подымаю руку от Sony");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
