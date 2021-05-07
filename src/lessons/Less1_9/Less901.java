package lessons.Less1_9;

public class Less901 {


    public static String checkAge(int age) {
        if (age < 16) {
            return "Sorry, you are too yang!";
        } else if (age >= 16 && age < 18) {
            return "You can drive a car!";

        } else if (age >= 18 && age < 21) {
            return "Yor can bay a lottery ticket!";
        } else {
            return "You can do whatever you want to do!";

        }
    }


    public static void main(String[] args) {
        int age = 21;
        System.out.println(checkAge(age));
    }


}