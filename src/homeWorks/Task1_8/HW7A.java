package homeWorks.Task1_8;

import java.util.Locale;

public class HW7A {
    public static void main(String[] args) {
        System.out.println(remove("Apple"));
        System.out.println(updateLight("red"));
    }
    /*
Write a function which converts the input string to uppercase.
 */
    public static String MakeUpperCase(String str){
        return str.toUpperCase(Locale.ROOT);
    }

    /*
    It's pretty straightforward. Your goal is to create a function that removes the first and last characters of a string. You're given one parameter, the original string. You don't have to worry with strings with less than two characters.
     */
    public static String remove(String str) {

        String newStr = "";
        for (int i = 1; i < str.length()-1; i++) {
            newStr += str.charAt(i);
        }
  //      str.substring(1,str.length()-1);
        return newStr;
     }
     /*Simple, remove the spaces from the string, then return the resultant string.*/

    static String noSpace(final String x) {

        return x.replace(" ","");
    }
    /*You're writing code to control your town's traffic lights. You need a function to handle each change from green, to yellow, to red, and then to green again.

Complete the function that takes a string as an argument representing the current state of the light and returns a string representing the state the light should change to.

For example, update_light('green') should return 'yellow'.*/

    public static String updateLight(String current) {
        if (current.equals("green")){
            current ="yellow";
        }else if (current.equals("yellow")){
            current = "red";
        }else if (current.equals("red")){
            current = "green";
        } return  current;
    }

    /* Write a function called repeat_string which repeats the given string str exactly count times.*/

    public static String repeatStr(final int repeat, final String string) {
       String strFinal = "";
        for (int i = 0; i < repeat; i++) {
            strFinal += string;
            }
        return strFinal;
    }
}
