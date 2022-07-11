package les7.Test.Task1;

import java.util.Scanner;

public class TestScenario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Computer computer = new Computer("Intel Core I5", "DDR4 Kingston", "SSD Kingston");
        System.out.println(computer.PrintInfoAboutComputer());
        System.out.println("Введите число от 0 до 1");
        for (boolean results = false; results == false; ) {
            int chislo = scan.nextInt();
            computer.Random();
            results = computer.TurnOn(chislo);
        }
        int EndComputer = computer.getCounterTryEnd();
        System.out.println();
        if (EndComputer != 5) {
            for (boolean results = false; results == false; ) {
                System.out.println("Введите число 0 или 1, чтобы выключить компьтер");
                int chisloOff = scan.nextInt();
                computer.Random();
                results = computer.TurnOff(chisloOff);
            }
        }
    }
}
