package homeWorks.Task10;

public final class Manager extends BaseEmployee {

    private int countEmployee;

    public Manager(String name, String sex, int age, int salary, int countEmployee) {
        super(name, sex, age, salary);
        this.countEmployee = countEmployee;
    }

    public int getCountEmployee() {
        return countEmployee;
    }

    public void setCountEmployee(int countEmployee) {
        this.countEmployee = countEmployee;
    }

    @Override
    public double getSalary(Month[] monthArray) {
        double res = super.getSalary(monthArray);

        return res + res * (getCountEmployee() * 0.01);
    }
}
