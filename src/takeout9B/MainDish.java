package takeout9B;

public class MainDish {
    private String mainDishName;
    private double maimDishPrice;

    MainDish (String name, double price){
        this.mainDishName = name;
        this.maimDishPrice = price;
    }

    public String getMainDishName(){
        return mainDishName;
    }
    public double getMainDishPrice (){
        return maimDishPrice;
    }
    public void setMainDishName (String name){
        this.mainDishName = name;
    }
    public void setMaimDishPrice (double price){
        this.maimDishPrice = price;
    }
}
