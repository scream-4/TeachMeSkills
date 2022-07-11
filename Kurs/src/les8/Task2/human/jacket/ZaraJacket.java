package les8.Task2.human.jacket;

public class ZaraJacket implements IJacket {
    private int price;

    public ZaraJacket(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public void PutOnJacket() {
        System.out.println("Надеваю куртку от Zara)");
    }

    @Override
    public void TakeOffJacket() {
        System.out.println("Снимаю куртку от Zara(");
    }
}
