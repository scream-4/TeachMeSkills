package les8.Task2.human.shoes;

public class BershkaShoes implements IShoes {
    private int price;

    public BershkaShoes(int price) {
        this.price = price;
    }

    @Override
    public void PutOnShoes() {
        System.out.println("Надеваю кроссовки от Bershka");
    }

    @Override
    public void TakeOffShoes() {
        System.out.println("Снимаю кроссовки от Bershka");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
