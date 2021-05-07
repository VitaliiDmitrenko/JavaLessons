public class FirstClass {
    public static void main(String[] args) {

        String str1 = "Перестановочный алгоритм быстрого действия";
        String str2 = "Перестановочный алгоритм быстрого действия";

        //    System.out.println(str1.indexOf("о"));
        for (int i = 0; i < str2.length(); i++) {
//           if (str1.indexOf("о") == i){
//               System.out.println(str1.charAt(i));
//           }

            if (str2.charAt(i) == 'о'){
                System.out.println(str1.charAt(i));

            }
        }
    }
}
