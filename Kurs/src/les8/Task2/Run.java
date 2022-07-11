package les8.Task2;

import les8.Task2.human.IHuman;
import les8.Task2.human.jacket.BershkaJacket;
import les8.Task2.human.jacket.NikeJacket;
import les8.Task2.human.jacket.ZaraJacket;
import les8.Task2.human.pants.BershkaPants;
import les8.Task2.human.pants.NikePants;
import les8.Task2.human.pants.ZaraPants;
import les8.Task2.human.shoes.BershkaShoes;
import les8.Task2.human.shoes.NikeShoes;
import les8.Task2.human.shoes.ZaraShoes;

public class Run {
    public static void main(String[] args) {
        BershkaJacket bershkaJacket = new BershkaJacket(100);
        NikeJacket nikeJacket = new NikeJacket(150);
        ZaraJacket zaraJacket = new ZaraJacket(110);

        BershkaPants bershkaPants = new BershkaPants(90);
        NikePants nikePants = new NikePants(140);
        ZaraPants zaraPants = new ZaraPants(100);

        BershkaShoes bershkaShoes = new BershkaShoes(70);
        NikeShoes nikeShoes = new NikeShoes(320);
        ZaraShoes zaraShoes = new ZaraShoes(120);

        IHuman human1 = new Human("George",zaraJacket,nikePants,zaraShoes);
        human1.getDressed();
        System.out.println();
        human1.undress();
        System.out.println("Стоимость одежды George : " + human1.getPrice() + "\n");

        IHuman human2 = new Human("Bob",nikeJacket,zaraPants,nikeShoes);
        human2.getDressed();
        System.out.println();
        human2.undress();
        System.out.println("Стоимость одежды Bob: " + human2.getPrice() + "\n");

        IHuman human3 = new Human("Kira",bershkaJacket,bershkaPants,bershkaShoes);
        human3.getDressed();
        System.out.println();
        human3.undress();
        System.out.println("Стоимость одежды Kira: " + human3.getPrice() + "\n");

        int priceGeorge = human1.getPrice();
        int priceBob = human2.getPrice();
        int priceKira = human3.getPrice();
        if (priceGeorge == priceBob && priceBob == priceKira){
            System.out.println("У всех одежда по одинаковой стоимости");
        }else {
            if (priceGeorge > priceBob && priceGeorge > priceKira) {
                System.out.println("Самая дорогая одежда у George");
            } else if (priceKira > priceGeorge && priceKira > priceBob) {
                System.out.println("Самая дорогая одежда у Kira");
            } else {
                System.out.println("Самая дорогая одежда у Bob");
            }
        }
    }
}
