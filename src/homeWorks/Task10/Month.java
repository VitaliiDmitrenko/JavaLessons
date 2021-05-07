package homeWorks.Task10;

public class Month {
    private final String month;
    private final int monthDays;
    private final int workMonthDays;

    public Month(String month, int monthDays, int workMonthDays) {
        this.month = month;
        this.monthDays = monthDays;
        this.workMonthDays = workMonthDays;
    }

    public String getMonth() {
        return month;
    }

    public int getMonthDays() {
        return monthDays;
    }

    public int getWorkMonthDays() {
        return workMonthDays;
    }
}
