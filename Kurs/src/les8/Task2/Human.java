package les8.Task2;

import les8.Task2.human.IHuman;
import les8.Task2.human.jacket.IJacket;
import les8.Task2.human.pants.IPants;
import les8.Task2.human.shoes.IShoes;

public class Human implements IHuman {
    private String Name;
    private IJacket jacket;
    private IPants pants;
    private IShoes shoes;

    public Human(String name, IJacket jacket, IPants pants, IShoes shoes) {
        Name = name;
        this.jacket = jacket;
        this.pants = pants;
        this.shoes = shoes;
    }

    @Override
    public void undress() {
        jacket.TakeOffJacket();
        pants.TakeOffPants();
        shoes.TakeOffShoes();
    }

    @Override
    public void getDressed() {
        jacket.PutOnJacket();
        pants.PutOnPants();
        shoes.PutOnShoes();
    }

    @Override
    public int getPrice() {
        int price = jacket.getPrice() + pants.getPrice() + shoes.getPrice();
        return price;
    }

}
