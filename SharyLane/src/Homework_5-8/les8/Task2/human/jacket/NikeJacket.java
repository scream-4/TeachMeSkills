package les8.Task2.human.jacket;

public class NikeJacket implements IJacket {
    private int price;

    public NikeJacket(int price) {
        this.price = price;
    }

    @Override
    public void PutOnJacket() {
        System.out.println("Надеваю куртку от Nike");
    }

    @Override
    public void TakeOffJacket() {
        System.out.println("Снимаю куртку от Nike");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
