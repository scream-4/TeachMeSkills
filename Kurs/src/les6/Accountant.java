package les6;

public class Accountant implements InfoAboutJob{
private String jobtitle = "Senior Accountant";
private int salary = 300;
    @Override
    public void PrintJobTitle() {
        System.out.println("Должность бухгалтера: "+jobtitle);
    }

    @Override
    public void PrintSalary() {
        System.out.println("Зарплата в $: "+salary);
    }
}
