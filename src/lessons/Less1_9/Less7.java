package lessons.Less1_9;

import java.util.Arrays;

public class Less7 {

    public static String getName() {
        String name = "Anna";
        return name;
    }

    public static String[] getFullName(){
        String firstName = "Grigory";
        String lastName = "Orlov";
        return new String[]{firstName, lastName};
    }
    public static void greeting(String firstName, String lastName) {

        System.out.println("Hello " + firstName + " " +lastName+"!");
        System.out.println("Welcome to the our website!");

    }

    public static void main(String[] args) {

        greeting(getFullName()[0],getFullName()[1]);
//        System.out.println(Arrays.toString(getFullName()));
    }
}
