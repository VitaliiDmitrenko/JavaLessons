package homeWorks.Task10;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Vitalii","Male", 40, 100);


        System.out.println(employee.getSalary(MonthUtils.YEAR));

        System.out.println(employee.getSalary(new Month[]{MonthUtils.JAN}));
        System.out.println(employee.getSalary(new Month[]{MonthUtils.FAB}));

        Manager manager = new Manager("Kolya","Male", 55, 100,5);

        System.out.println(manager.getSalary(new Month[]{MonthUtils.FAB}));
    }
}
