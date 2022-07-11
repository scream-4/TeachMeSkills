package les5;

import java.util.Scanner;

public class TestScenario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CreditCard card1 = new CreditCard(41700253,50);
        CreditCard card2 = new CreditCard(41700810,30);
        CreditCard card3 = new CreditCard(41700325,100);
        System.out.println("Положите деньги на 1 карту: ");
        double money = sc.nextInt();
        card1.AddMoney(money);
        card1.Commission(money);
        card1.printCardInfo();
        System.out.println("Положите деньги на 2 карту: ");
        money = sc.nextInt();
        card2.AddMoney(money);
        card2.Commission(money);
        card2.printCardInfo();
        for(boolean flag = false;flag == false;) {
            System.out.println("Сумма снятие денег с 3 карты: ");
            money = sc.nextInt();
            flag = card3.TakeMoney(money);
            card3.Commission(money);
        }
        card3.printCardInfo();
        System.out.println();

        Computer comp1 = new Computer(1000, "HP");
        System.out.println(comp1.getInfo());
        System.out.println();
        Computer comp2 = new Computer(1000, "HP", "Ram1", 16, "HDD1", 32, "HDD2");
        System.out.println(comp2.getInfo());
        System.out.println();


        CashMachine cashmachine = new CashMachine(0, 0, 0);
        cashmachine.AddMoney(40, 15, 10);
        cashmachine.printInfoCashMachine();
        System.out.println();
        System.out.println("Сумма снятия денег с банкомата: ");
        int summa = sc.nextInt();
        boolean result = cashmachine.withdraw(summa);
        if (result) {
            System.out.println("Я успешно снял ");
        } else {
            System.out.println("ERROR");
        }
        System.out.println();
        cashmachine.printInfoCashMachine();
    }
}
