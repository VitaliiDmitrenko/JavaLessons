package cars;

public class FleetTwo {
    public static void main(String[] args) {


        Carrr ford = new Carrr("Ford f350", 2020, 9);
        Carrr ram = new Carrr("Ram 3500", 2020, 8);


        Carrr[] fleet = {ford, ram};


//        FleetUtils.printFleetData(fleet);
//        System.out.println();
//        System.out.println("Average car year: " + FleetUtils.getAverageAge(fleet));
//
//
//        System.out.println();
//        System.out.println("Fuel cost $: " + FleetUtils.getFuelCost(fleet, 20000, 3.75));


        FleetUtils.printAllData(fleet);
    }
}
