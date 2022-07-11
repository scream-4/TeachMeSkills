package les7;

public class TestScenario {
    public static void main(String[] args) {
        Transport passengerTransport = new PassengerTransport(100,200,1300,"Volkswagen Polo",4,9,"Hatchback",5);
        passengerTransport.PrintInfo();
        System.out.println();

        Transport cargoTransport = new CargoTransport(230,60,1600,"Maz 5551",12,18,8500);
        cargoTransport.PrintInfo();
        System.out.println();

        Transport civilTransport = new CivilAirTransport(300,500,10000,"Boeing",30,25,250,true);
        civilTransport.PrintInfo();
        System.out.println();

        Transport militaryTransport = new MilitaryAirTransport(400,500,20000,"Aerobus",40,55,false,1);
        militaryTransport.PrintInfo();
        System.out.println();
    }
}
