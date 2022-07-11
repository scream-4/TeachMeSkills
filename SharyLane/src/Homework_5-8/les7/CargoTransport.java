package les7.Test;

import java.util.Scanner;

public class CargoTransport extends GroundTransport {
    private int LoadCapacity;

    public CargoTransport(int power, int maximumSpeed, int weight, String brand, int numberOfWheels, int fuelConsumption, int loadCapacity) {
        super(power, maximumSpeed, weight, brand, numberOfWheels, fuelConsumption);
        LoadCapacity = loadCapacity;
    }

    private double CalculatePower() {
        return getPower() * 0.74;
    }

    public void PrintInfo() {
        System.out.println("Информация о грузовом транспорте-->");
        System.out.println("Лошадиные силы: " + getPower());
        System.out.println("Максимальная скорость (км/ч): " + getMaximumSpeed());
        System.out.println("Вес автомобиля: " + getWeight());
        System.out.println("Марка автомобился" + getBrand());
        System.out.println("Количество колес: " + getNumberOfWheels());
        System.out.println("Расход топлива (л/100км): " + getFuelConsumption());
        System.out.println("Грузоподъемность (т): " + LoadCapacity);
        System.out.println("Расчет мощности в киловаттах: " + CalculatePower());
        CalculateLoadCapacity();

    }

    public void CalculateLoadCapacity() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество груза: ");
        int countCargo = scan.nextInt();
        if (countCargo < LoadCapacity) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }
    }
}
