package cars;

public class FleetUtils {

    static int ANNUAL_MILEAGE = 20000;
    static double PRICE_PER_GALLON = 5.75;


    public static void printFleetData (Carrr[] fleet){
        for (int i = 0; i < fleet.length; i++) {
            System.out.println(fleet[i].getModel() + " "+ fleet[i].getYear() + " " + fleet[i].getMpg());

        }
    }

    public static double getAverageAge (Carrr[] fleet){
        int agaSum = 0;
        for (int i = 0; i < fleet.length; i++) {
            agaSum += 2021 - fleet[i].getYear();

        }
        return (double) agaSum/ fleet.length;
    }

    public static double getFuelCost (Carrr[] fleet){
        int coast = 0;
        for (int i = 0; i < fleet.length; i++) {
            coast += ANNUAL_MILEAGE / fleet[i].getMpg() * PRICE_PER_GALLON;
        }
        return coast;
    }

    public static void printAllData (Carrr[] fleet){
        printFleetData(fleet);
        System.out.println();
        System.out.println("Average car year: " + getAverageAge(fleet));


        System.out.println();
        System.out.println("Fuel cost $: " + getFuelCost(fleet));

    }




}
