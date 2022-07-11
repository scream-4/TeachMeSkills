package les7.Test;


public class MilitaryAirTransport extends AirTransport {
    private boolean ThePresenceOfAnEjectionSystem;
    private int NumberOfMissilesOnBoard;

    public MilitaryAirTransport(int power, int maximumSpeed, int weight, String brand, int wingspan, int minimumRunwayLengthForTakeoff, boolean thePresenceOfAnEjectionSystem, int numberOfMissilesOnBoard) {
        super(power, maximumSpeed, weight, brand, wingspan, minimumRunwayLengthForTakeoff);
        ThePresenceOfAnEjectionSystem = thePresenceOfAnEjectionSystem;
        NumberOfMissilesOnBoard = numberOfMissilesOnBoard;
    }

    private double CalculatePower() {
        return getPower() * 0.74;
    }

    public void PrintInfo() {
        System.out.println("Информация о военном самолете-->");
        System.out.println("Лошадиные силы: " + getPower());
        System.out.println("Максимальная скорость (км/ч): " + getMaximumSpeed());
        System.out.println("Вес автомобиля: " + getWeight());
        System.out.println("Марка автомобился" + getBrand());
        System.out.println("Размах крыльев (м): " + getWingspan());
        System.out.println("Минимальная длинна взлётно-посадочной полосы для взлёта: " + getMinimumRunwayLengthForTakeoff());
        System.out.println("Наличие системы капультирования: " + ThePresenceOfAnEjectionSystem);
        System.out.println("Количество ракет на борту: " + NumberOfMissilesOnBoard);
        System.out.println("Расчет мощности в киловаттах: " + CalculatePower());
        Shot();
        Catapult();
    }

    public void Catapult() {
        if (ThePresenceOfAnEjectionSystem) {
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }
    }

    public void Shot() {
        if (NumberOfMissilesOnBoard != 0) {
            System.out.println("Ракета пошла");
        } else {
            System.out.println("Боеприпасы отсутствуют");
        }
    }
}
