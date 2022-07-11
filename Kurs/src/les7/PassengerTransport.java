package les7;

import java.util.Scanner;

public class PassengerTransport extends GroundTransport {
    private String BodyType;
    private int NumberOfPassengers;

    public PassengerTransport(int power, int maximumSpeed, int weight, String brand, int numberOfWheels, int fuelConsumption, String bodyType, int numberOfPassengers) {
        super(power, maximumSpeed, weight, brand, numberOfWheels, fuelConsumption);
        BodyType = bodyType;
        NumberOfPassengers = numberOfPassengers;
    }

    private double CalculatePower() {
        return getPower() * 0.74;
    }

    public void PrintInfo() {
        System.out.println("Легковой автомобиль информация--> ");
        System.out.println("Лошадиные силы: " + getPower());
        System.out.println("Максимальная скорость (км/ч): " + getMaximumSpeed());
        System.out.println("Вес автомобиля: " + getWeight());
        System.out.println("Марка автомобился" + getBrand());
        System.out.println("Количество колес: " + getNumberOfWheels());
        System.out.println("Расход топлива (л/100км): " + getFuelConsumption());
        System.out.println("Тип кузова: " + BodyType);
        System.out.println("Количество мест: " + NumberOfPassengers);
        System.out.println("Расчет мощности в киловаттах: " + CalculatePower());
        CalculateDistance();
    }

    private double CalculateDistance(double timeMinutes) {
        double distance = (timeMinutes / 60) * getMaximumSpeed();
        return distance;
    }

    private double CalculateFuelUsed(double distance) {
        double fuelUsed = (distance / 100) * getFuelConsumption();
        return fuelUsed;
    }

    public void CalculateDistance() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите время: ");
        double timeMinutes = scan.nextInt();
        double distance = CalculateDistance(timeMinutes);
        double fuelUsed = CalculateFuelUsed(distance);
        System.out.println("За время " + timeMinutes + " минут, автомобиль " + getBrand() + " двигаясь с максимальной скоростью " + getMaximumSpeed() + " км/ч проедет (" + distance + ") км и израсходует " + fuelUsed + " литров топлива.");
    }
}

