package takeout9B;

public class Side {
    private String sideName;
    private double sidePrice;

    public Side(String sideName, double sidePrice) {
        this.sideName = sideName;
        this.sidePrice = sidePrice;
    }

    public String getSideName() {
        return sideName;
    }

    public double getSidePrice() {
        return sidePrice;
    }

    public void setSideName(String sideName) {
        this.sideName = sideName;
    }

    public void setSidePrice(double sidePrice) {
        this.sidePrice = sidePrice;
    }
}
