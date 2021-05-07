package homeWorks.Task1_8;

import java.util.Locale;

public class Task6 {
    public static void main(String[] args) {


        /* Задача №1
        Дана строка:
        String s = “Перестановочный алгоритм быстрого действия”;
        необходимо вывести все буквы “о” из этой строки.
                Для указанной строки ответ будет “ооооо” (или в столбик)*/
        System.out.println("Задача №1");
        String str1 = "Перестановочный алгоритм быстрого действия";

        //    System.out.println(str1.indexOf("о"));
        for (int i = 0; i < str1.length(); i++) {
//           if (str1.indexOf("о") == i){
//               System.out.println(str1.charAt(i));
//           }

            if (str1.charAt(i) == 'о'){
                System.out.print(str1.charAt(i));


            }
        }
        System.out.println();
        System.out.println();
        /* Задача №2
        Дана строка:
        String s = “Перевыборы выбранного президента”;
        необходимо подсчитать количество букв “е” в строке.
        Для указанной строки ответ будет 4.*/
        System.out.println("Задача №2");
        String str2 = "Перевыборы выбранного президента";
        int count =0;
        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) == 'е'){
                count++;
            }

        }
        System.out.println("Количество букв 'е': "+ count);
        System.out.println();

       /* Задача №3
        Дана строка:
        String s = “Посмотрите как Рите нравится ритм”;
        необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
                Для указанной строки ответ будет 6, 15, 29.*/
        System.out.println("Задача №3");
        String str3 = "Посмотрите как Рите нравится ритм";
        String strTemp = str3.toLowerCase();
        int index = strTemp.indexOf("рит");
        while (index != -1){
            System.out.println(index);
            index = strTemp.indexOf("рит", index+1);
        }

        System.out.println();

       /* Экстра задача
        Дан массив:
        String[][] array = {{“Привет”, “всем”, “кто”}, {“изучает”, “язык”, “программирования”}, {“java”}};
        необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.*/
        System.out.println("Экстра задача");
        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
        int countE = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j].indexOf("е") == -1){
                    countE++;
                }
            }
        }
        System.out.println(countE);

    }
}
