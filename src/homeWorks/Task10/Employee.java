package homeWorks.Task10;

public final class Employee extends BaseEmployee {


    public Employee(String name, String sex, int age, int baseSalary) {
        super(name, sex, age, baseSalary);
    }
@Override
public double getSalary (Month[] monthArray){
    int res = 0;
    for (int i = 0; i < monthArray.length; i++) {
        res += monthArray[i].getWorkMonthDays()*super.getBaseSalary();

    }
    return res;
}


}
