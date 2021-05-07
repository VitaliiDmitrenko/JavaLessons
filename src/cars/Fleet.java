package cars;

import java.util.Arrays;

public class Fleet {
    public static void main(String[] args) {


        Carrr camry = new Carrr("Camry", 2021, 32);
//        camry.setModel("Camry");
//        camry.setYear(2021);
//        camry.setMpg(32);

        Carrr corolla = new Carrr("Corolla", 2015, 35);
        Carrr tacoma = new Carrr("Tacoma", 2016,20);
        Carrr prius = new Carrr("Prius", 2010, 50);

        Carrr[] fleet = {camry, corolla, tacoma,prius};


        FleetUtils.printFleetData(fleet);
        System.out.println();
        System.out.println("Average car year: " + FleetUtils.getAverageAge(fleet));


        System.out.println();
        System.out.println("Fuel cost $: " + FleetUtils.getFuelCost(fleet));


//        System.out.println(camry.getModel() + " "+ camry.getYear() + " " + camry.getMpg());
//        System.out.println(corolla.getModel() + " "+ corolla.getYear() + " " + corolla.getMpg());
//        System.out.println(tacoma.getModel() + " "+ tacoma.getYear() + " " + tacoma.getMpg());
//        System.out.println(prius.getModel() + " "+ prius.getYear() + " " + prius.getMpg());


    }
}
