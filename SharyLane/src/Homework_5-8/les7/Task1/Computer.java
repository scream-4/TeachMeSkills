package les7.Test.Task1;

import java.util.Random;

public class Computer {
    private String CPU;
    private String RAM;
    private String HDD;
    private int WorkCycle;
    private int CounterTryEnd = 0;
    private int CountTry = 5;

    public Computer(String CPU, String RAM, String HDD) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.HDD = HDD;
    }

    public int getCounterTryEnd() {
        return CounterTryEnd;
    }

    public String PrintInfoAboutComputer() {
        return "Computer {" +
                "Процессор = '" + CPU + '\'' +
                ", Оперативная память = '" + RAM + '\'' +
                ", Жесткий диск = '" + HDD + '\'' + "}";
    }

    public void Random() {
        Random rand = new Random();
        WorkCycle = rand.nextInt(2);
        System.out.println(WorkCycle);
    }

    public String ending() {
        if (CountTry == 4 || CountTry == 3 || CountTry == 2) {
            return " попытки";
        } else {
            return " попытка";
        }
    }

    public boolean TurnOn(int chislo) {
        if (chislo == WorkCycle) {
            System.out.println("{Компьютер запущен}" + "\nДобро пожаловать");
            return true;
        } else {
            CounterTryEnd += 1;
            if (CounterTryEnd == 5) {
                System.out.println("Комп сгорел" + "\n----------------");
                return true;
            } else {
                CountTry -= 1;
                System.out.println("Error" + "\nПопробуйте еще раз" + "\nУ вас осталось: " + CountTry + ending());
                return false;
            }
        }
    }

    public boolean TurnOff(int chislooff) {
        if (chislooff == WorkCycle) {
            System.out.println("{Компьютер выключен}");
            return true;
        } else {
            CounterTryEnd = CounterTryEnd + 1;
            if (CounterTryEnd == 5) {
                System.out.println("Комп сгорел" + "\n----------------");
                return true;
            } else {
                CountTry -= 1;
                System.out.println("Error" + "\nПопробуйте еще раз" + "\nУ вас осталось: " + CountTry + ending());
                return false;
            }
        }
    }
}
