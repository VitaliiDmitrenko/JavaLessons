package lessons.Less1_9;

import java.util.Arrays;

public class Less72IntroToMethod {
    public static void main(String[] args) {

        // variable
        //statements
        //methods/functions
        //classes
        //simpleMethod1();
//        System.out.println(powerOf2(50));
//        System.out.println(simpleMethod3("Wednesday"));
        task2();
    }

        public static void simpleMethod1() {
            System.out.println("Somthing else");
        }

        public static int powerOf2 (int parameter){
        return parameter*parameter;
        }

        public static String simpleMethod3 (String dayOfTheWeek){
            return "Today is "+ dayOfTheWeek;
        }
        public static void task2(){
        int number1 = 123456798;
        String var1 = Integer.toString(number1);

            System.out.println(Arrays.toString(var1.split("")));
        }

    }

