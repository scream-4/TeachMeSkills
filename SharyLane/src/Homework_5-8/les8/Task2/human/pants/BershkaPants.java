package les8.Task2.human.pants;

public class BershkaPants implements IPants {
    private int price;

    public BershkaPants(int price) {
        this.price = price;
    }

    @Override
    public void PutOnPants() {
        System.out.println("Надеваю штаны от Bershka =)");
    }

    @Override
    public void TakeOffPants() {
        System.out.println("Снимаю штаны от Bershka =)");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
