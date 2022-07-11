package les6;

public class Worker implements InfoAboutJob{
private String jobtitle = "Junior Worker";
private int salary = 250;
    @Override
    public void PrintJobTitle() {
        System.out.println("Должность работника: "+jobtitle);
    }

    @Override
    public void PrintSalary() {
        System.out.println("Зарплата в $: "+salary);
    }
}
