package les8.Task3;

import java.util.Random;

public class Shuttle implements IStart{

    @Override
    public boolean preSystemCheck() {
        Random rand = new Random();
        int RandomNumber = rand.nextInt(11);
        return RandomNumber > 3;
    }

    @Override
    public void engineStart() {
        System.out.println("Двигатели шатла запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Шатла...");
    }
}
