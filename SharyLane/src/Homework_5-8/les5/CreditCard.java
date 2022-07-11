package les5;

public class CreditCard {
    private int acount;
    private double money;

    public CreditCard(int acount, double money) {
        this.acount = acount;
        this.money = money;
    }

    public void Commission(double money) {
        double commis = money / 100 * 3;
        this.money = this.money - commis;
        System.out.println("Комиссия 3% ");
    }

    public void AddMoney(double money) {
        this.money += money;
    }

    public boolean TakeMoney(double money) {
        if (this.money >= money) {
            this.money -= money;
            return true;
        } else {
            System.out.println("У вас недостаточно средств на балансе");
            return false;
        }
    }

    public void printCardInfo() {
        System.out.println("CreditCard(" + "acount=" + acount + ", money=" + money + ')');
    }

}
