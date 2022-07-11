package les7.Test;

import java.util.Scanner;

public class CivilAirTransport extends AirTransport {
    private int NumberOfPassengers;
    private boolean AvailabilityOfBusinessClass;

    public CivilAirTransport(int power, int maximumSpeed, int weight, String brand, int wingspan, int minimumRunwayLengthForTakeoff, int numberOfPassengers, boolean availabilityOfBusinessClass) {
        super(power, maximumSpeed, weight, brand, wingspan, minimumRunwayLengthForTakeoff);
        NumberOfPassengers = numberOfPassengers;
        AvailabilityOfBusinessClass = availabilityOfBusinessClass;
    }

    private double CalculatePower() {
        return getPower() * 0.74;
    }

    public void PrintInfo() {
        System.out.println("Информация о гражданском транспорте-->");
        System.out.println("Лошадиные силы: " + getPower());
        System.out.println("Максимальная скорость (км/ч): " + getMaximumSpeed());
        System.out.println("Вес автомобиля: " + getWeight());
        System.out.println("Марка автомобился" + getBrand());
        System.out.println("Размах крыльев (м): " + getWingspan());
        System.out.println("Минимальная длинна взлётно-посадочной полосы для взлёта: " + getMinimumRunwayLengthForTakeoff());
        System.out.println("Количество пассажиров: " + NumberOfPassengers);
        System.out.println("Наличие бизнес класса: " + AvailabilityOfBusinessClass);
        System.out.println("Расчет мощности в киловаттах: " + CalculatePower());
        CalculateNumberOfPassengers();
    }

    public void CalculateNumberOfPassengers() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество пассажир: ");
        int numbersPassengers = scan.nextInt();
        if (numbersPassengers < NumberOfPassengers) {
            System.out.println("Самолет загружен");
        } else {
            System.out.println("Вам нужен самолет побольше");
        }
    }
}
