package lessons.Ticket;

public class Employee extends Person {

    private int salary;

    public Employee(String name, int age, char sex, int salary) {
        super(name, age, sex);
        this.salary = salary;
    }

    public String getName() {
      return getBaseName();
    }
}
