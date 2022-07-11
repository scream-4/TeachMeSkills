package les8;

import les8.robot.IRobot;
import les8.robot.hands.IHand;
import les8.robot.hands.SamsungHand;
import les8.robot.hands.SonyHand;
import les8.robot.hands.ToshibaHand;
import les8.robot.heads.SamsungHead;
import les8.robot.heads.SonyHead;
import les8.robot.heads.ToshibaHead;
import les8.robot.legs.SamsungLeg;
import les8.robot.legs.SonyLeg;
import les8.robot.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */
        SonyHand sonyHand = new SonyHand(70);
        SamsungHand samsungHand = new SamsungHand(60);
        ToshibaHand toshibaHand = new ToshibaHand(40);

        SonyHead sonyHead = new SonyHead(90);
        SamsungHead samsungHead = new SamsungHead(75);
        ToshibaHead toshibaHead = new ToshibaHead(60);

        SonyLeg sonyLeg = new SonyLeg(60);
        SamsungLeg samsungLeg = new SamsungLeg(55);
        ToshibaLeg toshibaLeg = new ToshibaLeg(40);

        IRobot robot1 = new Robot(samsungHead, sonyHand, toshibaLeg);
        robot1.action();
        System.out.println("Стоимость 1 робота: " + robot1.getPrice() + "\n");

        IRobot robot2 = new Robot(sonyHead, toshibaHand, samsungLeg);
        robot2.action();
        System.out.println("Стоимость 2 робота: " + robot2.getPrice() + "\n");

        IRobot robot3 = new Robot(toshibaHead, samsungHand, sonyLeg);
        robot3.action();
        System.out.println("Стоимость 3 робота: " + robot3.getPrice());

        int robot1Price = robot1.getPrice();
        int robot2Price = robot2.getPrice();
        int robot3Price = robot3.getPrice();
        if (robot1Price == robot2Price && robot1Price == robot3Price) {
            System.out.println("Все роботы равной стоимости");
        } else if (robot1Price == robot2Price && robot2Price > robot3Price) {
            System.out.println("Робот 1 и 2 самые дорогие");
        } else if (robot2Price == robot3Price && robot2Price > robot1Price) {
            System.out.println("Робот 2 и 3 самые дорогие");
        } else if (robot1Price > robot2Price && robot1Price > robot3Price) {
            System.out.println("Самый дорогой робот 1");
        } else if (robot3Price > robot2Price && robot3Price > robot1Price) {
            System.out.println("Самый дорогой робот 3");
        } else {
            System.out.println("Самый дорогой робот 2");
        }
    }
}
