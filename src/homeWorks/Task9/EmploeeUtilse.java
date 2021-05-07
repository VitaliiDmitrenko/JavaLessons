package homeWorks.Task9;

import java.util.Objects;

public class EmploeeUtilse {
    public static double getSum (Employee[] empArray) {
        double result = 0;
        for (int i = 0; i < empArray.length; i++) {
            result += empArray[i].getSalary();
            }
        return result;

    }

    static Employee findByName (String name, Employee[] employees) {

        for (int i = 0; i < employees.length; i++) {
            if (Objects.equals(name,employees[i].person.getName())){
            return employees[i];
            }
        }
        return null;
    }
    static Employee findBySubName (String subName, Employee[] employees) {

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].person.getName() != null &&
                    employees[i].person.getName().contains(subName)) {
                return employees[i];
            }
        }
        return null;

    }
}
