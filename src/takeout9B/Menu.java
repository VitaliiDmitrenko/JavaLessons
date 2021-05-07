package takeout9B;

import static takeout9B.utils.PrintUtils.CommonPrintMethods.*;
import static takeout9B.utils.PrintUtils.PrintSpaces.*;
import static takeout9B.utils.PrintUtils.PrintTitles.*;

public class Menu {

    static final MainDish beef = new MainDish("Beef Wellington", 13);
    static final MainDish fish = new MainDish("Miso Salmon", 12.00);
    static final MainDish chicken = new MainDish("Chicken Teriaki", 7);
    static final MainDish pork = new MainDish("Honey Garlic Pork Chops", 10);


    static Side rise = new Side("Brown Rice", 2.99);
    static Side asparagus = new Side("Oven-Roasted Asparagus", 4.50);
    static Side beens = new Side("Green Beens Amandine", 5);
    static Side potato = new Side("Creamy Mashed Potatoes", 4);


    static Drink water = new Drink("Perrier@ carbonated mineral water", 3.50);
    static Drink wineWhite = new Drink("Oaked Chardonnay", 20.50);
    static Drink wineRed = new Drink("Red wine", 40);
    static Drink juiceApple = new Drink("Fresh squeezad Apple juice", 10);

    MainDish[] mainDishes = new MainDish[]{beef, fish, chicken, pork};
    Side[] sides = new Side[]{rise, asparagus, beens, potato};
    Drink[] drinks = new Drink[]{water, wineWhite, wineRed, juiceApple};

    public static MainDish getBeef() {
        return beef;
    }



    public String[] getMainDishesNames() {
        String[] mainDishesNames = new String[mainDishes.length];
        for (int i = 0; i < mainDishesNames.length; i++) {
            mainDishesNames[i] = mainDishes[i].getMainDishName();
        }
        return mainDishesNames;
    }

    public double[] getMainDishesPrices() {
        double[] mainDishesPrices = new double[mainDishes.length];
        for (int i = 0; i < mainDishes.length; i++) {
            mainDishesPrices[i] = mainDishes[i].getMainDishPrice();
        }
        return mainDishesPrices;
    }

    public String[] getSidesNames() {
        String[] sidesNames = new String[sides.length];
        for (int i = 0; i < sidesNames.length; i++) {
            sidesNames[i] = sides[i].getSideName();
        }
        return sidesNames;
    }

    public double[] getSidesPrices() {
        double[] sidesPrices = new double[sides.length];
        for (int i = 0; i < sides.length; i++) {
            sidesPrices[i] = sides[i].getSidePrice();
        }
        return sidesPrices;
    }


    public String[] getDrinksNames() {
        String[] drinksNames = new String[drinks.length];
        for (int i = 0; i < drinks.length; i++) {
            drinksNames[i] = drinks[i].getDrinkName();
        }
        return drinksNames;
    }

    public double[] getDrinksPrices() {
        double[] drinkPrices = new double[drinks.length];
        for (int i = 0; i < drinks.length; i++) {
            drinkPrices[i] = drinks[i].getDrinkPrice();
        }
        return drinkPrices;
    }

    private void printMainDishes() {
        printMainDishesTitle();
        for (int i = 0; i < getMainDishesNames().length; i++) {
            print(getMainDishesNames()[i]);
            printSpacesAfterName(spacesAfterName(getDrinksNames(),getSidesNames(),
                    getMainDishesNames(),getMainDishesNames()[i]));
            printPrice(getMainDishesPrices()[i]);
            println();

        }
        println();
    }

    private void printSides() {
        printSidesTitle();
        for (int i = 0; i < getSidesNames().length; i++) {
            print(getSidesNames()[i]);
            printSpacesAfterName(spacesAfterName(getDrinksNames(),getSidesNames(),
                    getMainDishesNames(),getSidesNames()[i]));
            printPrice(getSidesPrices()[i]);
            println();
        }
        println();
    }

    private void printDrinks() {
        printDrinksTitle();
        for (int i = 0; i < getDrinksNames().length; i++) {
            print(getDrinksNames()[i]);
            printSpacesAfterName(spacesAfterName(getDrinksNames(),getSidesNames(),
                    getMainDishesNames(),getDrinksNames()[i]));
            printPrice(getDrinksPrices()[i]);
            println();

        }
        println();
    }

    public void printMenu() {
        printMenuTitle();
        printMainDishes();
        printSides();
        printDrinks();
        println();
        printLine();

    }
}
