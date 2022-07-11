package les6.addit_task;

public class Test1 {
    private int numberOne;
    private int numberTwo;

    public Test1(int numberOne, int numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    public int getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(int numberOne) {
        this.numberOne = numberOne;
    }

    public int getNumberTwo() {
        return numberTwo;
    }

    public void setNumberTwo(int numberTwo) {
        this.numberTwo = numberTwo;
    }

    public void PrintInfoNumbers() {
        System.out.println("Числа: " + numberOne + ", " + numberTwo);
    }
}
