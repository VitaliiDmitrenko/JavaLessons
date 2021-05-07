package lessons.Less1_9;

/*
You will be given a vector of strings. You must sort it alphabetically (case-sensitive, and based on the ASCII values of the chars) and then return the first value.

The returned value must be a string, and have "***" between each of its letters.

You should not remove or add elements from/to the array.
 */

import java.util.Arrays;

// assertEquals("b***i***t***c***o***i***n", SortAndStar.twoSort(new String[] {"bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"}));
public class Less701 {
    public static String twoSort(String[] s) {
        Arrays.sort(s);
        String start = s[0];
        String result = "";
        for (int i = 0; i <start.length() ; i++) {
           result += start.charAt(i);
           if (i < start.length()-1){
               result += "***";
           }

        }
        return result;
    }



    public static void main(String[] args) {
    String []array = {"bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"};

        System.out.println(twoSort(array));
    }

    public static boolean check(Object[] a, Object x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals(x)){
                return true;
            }

        }
        return false;
    }


}