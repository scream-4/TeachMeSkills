package les6;

public class Director implements InfoAboutJob{
    private String jobtitle = "Sales Director";
    private int salary = 400;

    @Override
    public void PrintJobTitle() {
        System.out.println("Должность директора: "+jobtitle);
    }

    @Override
    public void PrintSalary() {
        System.out.println("Зарплата в $: "+salary);
    }

}
