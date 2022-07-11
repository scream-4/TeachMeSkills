package les6.addit_task;

import java.util.Arrays;

public class Student {
    private String Name;
    private String Surname;
    private int GroupNumber;
    private int[] Grades = new int[5];

    public Student(String name, String surname, int groupNumber, int... grades) {
        Name = name;
        Surname = surname;
        GroupNumber = groupNumber;
        for (int i = 0; i < Grades.length; i++) {
            Grades[i] = grades[i];
        }
    }
    public void PrintStudentInfo(){
        System.out.println("Студент: " + Surname +", Группа: " + GroupNumber +", Успеваемость: " + Arrays.toString(Grades));
    }
    public boolean ScoringSrudent() {
        for (int grade : Grades) {
            if(grade<9){
                return false;
            }
        }
        return true;
    }

}
