package les8.Task2.human.jacket;

public class BershkaJacket implements IJacket {
    private int price;

    public BershkaJacket(int price) {
        this.price = price;
    }

    @Override
    public void PutOnJacket() {
        System.out.println("Надеваю куртку от Bershka =)");
    }

    @Override
    public void TakeOffJacket() {
        System.out.println("Снимаю куртку от Bershka =)");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
