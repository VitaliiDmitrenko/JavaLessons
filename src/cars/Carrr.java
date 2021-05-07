package cars;

public class Carrr {

    String model;
    int year;
    int mpg; //instance field

    public Carrr(String model, int year, int mpg) {
        this.model = model;
        this.year = year;
        this.mpg = mpg;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMpg() {
        return mpg;
    }

    public void setMpg(int mpg) {
        this.mpg = mpg;
    }


}
