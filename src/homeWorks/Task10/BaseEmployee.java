package homeWorks.Task10;

public abstract class BaseEmployee {

    private String name;
    private String sex;
    private int age;
    private int baseSalary;

    public BaseEmployee(String name, String sex, int age, int baseSalary) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.baseSalary = baseSalary;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public double getSalary (Month[] monthArray){
        int res = 0;
        for (int i = 0; i < monthArray.length; i++) {
            res += monthArray[i].getWorkMonthDays()*this.getBaseSalary();

        }
        return res;

    }

}
