package les8.Task3;

public class TestScenario {
    public static void main(String[] args) throws InterruptedException {

        Cosmodrome cosmodrome = new Cosmodrome();

        IStart shuttle = new Shuttle();
        IStart spaceX = new SpaceX();

        cosmodrome.start(shuttle);
        System.out.println();
        cosmodrome.start(spaceX);
    }
}
