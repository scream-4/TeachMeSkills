package les8.Task3;

import java.util.Random;
import java.util.Scanner;

public class SpaceX implements IStart{

    @Override
    public boolean preSystemCheck() {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Введите число не больше 10");
        int chislo = scan.nextInt();
        int RandomNumber = rand.nextInt(10);
        return chislo > RandomNumber;
    }

    @Override
    public void engineStart() {
        System.out.println("Двигатели spaceX запущены. Все в норме");
    }

    @Override
    public void start() {
        System.out.println("Старт Ракеты...");
    }
}
