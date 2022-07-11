package les6.addit_task;

public class solution {

    public static int LargestOfNumbers(Test1 x) {
        if (x.getNumberOne() > x.getNumberTwo()) {
            return x.getNumberOne();
        } else {
            return x.getNumberTwo();
        }
    }

    public static int SummaNumbers(Test1 y) {
        int summa;
        summa = y.getNumberOne() + y.getNumberTwo();
        return summa;
    }
    public static int DifferenceOfNumbers(Test2 y){
        int differenceofnumbers;
        differenceofnumbers = y.getNumberOne() - y.getNumberTwo();
        return differenceofnumbers;
    }
}
