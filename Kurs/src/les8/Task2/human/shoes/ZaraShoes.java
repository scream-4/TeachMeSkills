package les8.Task2.human.shoes;

public class ZaraShoes implements IShoes {
    private int price;

    public ZaraShoes(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public void PutOnShoes() {
        System.out.println("Надеваю кроссовки от Zara)");
    }

    @Override
    public void TakeOffShoes() {
        System.out.println("Снимаю кроссовки от Zara(");
    }
}
