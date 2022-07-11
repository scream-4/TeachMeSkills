package les8.Task2.human.pants;

public class NikePants implements IPants {
    private int price;

    public NikePants(int price) {
        this.price = price;
    }

    @Override
    public void PutOnPants() {
        System.out.println("Надеваю штаны от Nike");
    }

    @Override
    public void TakeOffPants() {
        System.out.println("Снимаю штаны от Nike");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
