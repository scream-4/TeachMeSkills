package les6;

import les6.addit_task.Student;
import les6.addit_task.Test1;
import les6.addit_task.Test2;
import les6.addit_task.solution;

public class TestScenario {
    public static void main(String[] args) {
        Figure[] figure = {new Rectangle(5, 9),
                new Triangle(3, 6, 4),
                new Circle(8)};
        for(Figure fig : figure)
            System.out.println(fig.getName() + ": area = " + fig.getArea());

        Director director = new Director();
        director.PrintJobTitle();
        director.PrintSalary();
        System.out.println();
        Worker worker = new Worker();
        worker.PrintJobTitle();
        worker.PrintSalary();
        System.out.println();
        Accountant accountant = new Accountant();
        accountant.PrintJobTitle();
        accountant.PrintSalary();


        // addit task - 1
        Test1 test1 = new Test1(15,20);
        test1.PrintInfoNumbers();
        System.out.println("Сумма чисел: " + solution.SummaNumbers(test1));
        System.out.println("Наибольшее из чисел: " + solution.LargestOfNumbers(test1));


        // addit task - 2
        Test2 test2 = new Test2(5,7);
        System.out.println("Разность чисел: " + solution.DifferenceOfNumbers(test2));



        // addit task - 3
        Student student1 = new Student("Sergey","Lewis",101,7,8,5,7,8);
        Student student2 = new Student("Oliver","Henderson",103,9,10,10,9,9);
        Student student3 = new Student("Jack","Smith",105,7,8,9,9,8);
        Student student4 = new Student("Charlie","McGee",107,9,9,9,10,9);
        Student student5 = new Student("Jacob","Griffin",102,7,3,5,6,6);
        Student student6 = new Student("Alfie","Bailey",101,9,9,9,9,10);
        Student student7 = new Student("Sophie","Wallace",105,7,4,8,7,9);
        Student student8 = new Student("Mia","Davidson",103,10,10,10,9,9);
        Student student9 = new Student("Isabella","Davidson",102,9,8,9,9,10);
        Student student10 = new Student("Jessica","Zimmerman",102,9,8,10,10,10);
        Student students[] = {student1,student2,student3,student4,student5,student6,student7,student8,student9,student10};
        for (Student student: students){
            if(student.ScoringSrudent())student.PrintStudentInfo();
        }

    }
}
