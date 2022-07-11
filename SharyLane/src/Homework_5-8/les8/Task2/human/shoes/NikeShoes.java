package les8.Task2.human.shoes;

public class NikeShoes implements IShoes {
    private int price;

    public NikeShoes(int price) {
        this.price = price;
    }

    @Override
    public void PutOnShoes() {
        System.out.println("Надеваю кроссовки от Nike");
    }

    @Override
    public void TakeOffShoes() {
        System.out.println("Снимаю кроссовки от Nike");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
