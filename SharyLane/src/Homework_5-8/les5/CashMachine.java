package les5;

public class CashMachine {
    private int amountOf20;
    private int amountOf50;
    private int amountOf100;

    public CashMachine(int amountOf20, int amountOf50, int amountOf100) {
        this.amountOf20 = amountOf20;
        this.amountOf50 = amountOf50;
        this.amountOf100 = amountOf100;
    }

    public void AddMoney(int amountOf20, int amountOf50, int amountOf100) {
        this.amountOf20 += amountOf20;
        this.amountOf50 += amountOf50;
        this.amountOf100 += amountOf100;
    }

    public void printInfoCashMachine() {
        System.out.println("В банкомате: " +
                "\nБанкнот номиналом 20: " + this.amountOf20 +
                "\nБанкнот номиналом 50: " + this.amountOf50 +
                "\nБанкнот номиналом 100: " + this.amountOf100);
    }

    public boolean withdraw(int summa) {
        String info;
        int[] notesToReturn = calculatesNotes(summa);
        boolean result = false;

        if (isHasMoney()) {
            if (summa > 0) {
                if ((notesToReturn[0] > 0 || notesToReturn[1] > 0 || notesToReturn[2] > 0)) {
                    this.amountOf100 -= notesToReturn[0];
                    this.amountOf50 -= notesToReturn[1];
                    this.amountOf20 -= notesToReturn[2];
                    result = true;
                    info = "Number of 20: " + notesToReturn[2] + "\nNumber of 50: " + notesToReturn[1] + "\nNumber of 100: " + notesToReturn[0];
                } else {
                    info = "Таких банкнот нет, Введите другую сумму";
                }
            } else info = "Введите сумму больше 0";
        } else info = "В банкомате нет денег";
        System.out.println(info);

        return result;
    }

    private int[] calculatesNotes(int summa) {
        int rest = 0;
        int[] notes = {amountOf100, amountOf50, amountOf20};
        int[] resultNotes = {0, 0, 0};

        for (int i = 0; i < notes.length; i++) {
            int note;
            int temp = 0;
            if (i == 0) {
                note = 100;
            } else if (i == 1) {
                note = 50;
            } else note = 20;

            while (summa - note >= 0 && temp < notes[i]) {
                summa -= note;
                rest = summa;
                resultNotes[i]++;
                temp++;
            }
        }
        if (rest > 0) {
            for (int i = 0; i < resultNotes.length; i++) {
                resultNotes[i] = 0;
            }
        }
        return resultNotes;
    }

    private boolean isHasMoney() {
        if (this.amountOf100 > 0 || this.amountOf50 > 0 || this.amountOf20 > 0) return true;
        else return false;
    }

}
