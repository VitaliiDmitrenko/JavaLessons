package homeWorks.Task1_8;

import java.util.Locale;

public class HW7 {
/*
Timmy & Sarah think they are in love, but around where they live, they will only know once they pick a flower each. If one of the flowers has an even number of petals and the other has an odd number of petals it means they are in love.

Write a function that will take the number of petals of each flower and return true if they are in love and false if they aren't.
 */

    public static boolean isLove(final int flower1, final int flower2) {
        if ((flower1 + flower2) % 2 != 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(isLove(3, 4));
        System.out.println(numberToString(6545));
        int[] testArgs = {78, 56, 232, 12, 11, 43};
        System.out.println(findSmallestInt(testArgs));
        System.out.println(countingSheep(5));
    }

    public static String numberToString(int num) {

        return Integer.toString(num);
        // Return a string of the number here!
    }

/*    Given an array of integers your solution should find the smallest integer.

    For example:

    Given [34, 15, 88, 2] your solution will return 2
    Given [34, -345, -1, 100] your solution will return -345
    You can assume, for the purpose of this kata, that the supplied array will not be empty.*/

    public static int findSmallestInt(int[] args) {

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < args.length; i++) {
            if (min > args[i]) {
                min = args[i];
            }
        }
        return min;
    }

    /*
    Given a non-negative integer, 3 for example, return a string with a murmur: "1 sheep...2 sheep...3 sheep...". Input will always be valid, i.e. no negative integers.
     */

    public static String countingSheep(int num) {

        String count = "";
        for (int i = 0; i < num; i++) {
            count += i+1 + " sheep...";
        }
        return count;
    }
/*
Write a function which converts the input string to uppercase.
 */
    public static String MakeUpperCase(String str){
        return str.toUpperCase(Locale.ROOT);
    }
}
