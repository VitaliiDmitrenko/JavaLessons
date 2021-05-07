package lessons.Less10;

public class test2 {
    public static void main(String[] args) {
        System.out.println(tripleTrouble("this", "test", "lock"));
    }
    public static String tripleTrouble(String one, String two, String three) {
        String abc = "";
        for (int i = 0; i < one.length() ; i++) {
            abc += one.charAt(i);
            abc += two.charAt(i);
            abc += three.charAt(i);
        }
        return abc;
    }

}

