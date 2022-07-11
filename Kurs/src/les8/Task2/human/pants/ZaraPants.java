package les8.Task2.human.pants;

public class ZaraPants implements IPants {
    private int price;

    public ZaraPants(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public void PutOnPants() {
        System.out.println("Надеваю штаны от Zara)");
    }

    @Override
    public void TakeOffPants() {
        System.out.println("Снимаю штаны от Zara(");
    }
}
