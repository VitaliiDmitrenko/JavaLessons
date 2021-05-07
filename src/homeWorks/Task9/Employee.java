package homeWorks.Task9;

public class Employee {

    Person person;
    private double salary;

    public Employee(String name, String sex, int age, double salary) {
        this.person = new Person(name, sex, age);
        this.salary = salary;
    }

    public Employee(Person person, double salary) {
        this.person = person;
        this.salary = salary;
    }


    public double getSalary() {
        return salary;
    }




}
