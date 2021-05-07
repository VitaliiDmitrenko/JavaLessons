package class4;

public class New {
    public static void main(String[] args) {
        //наследование + абстракция
        Kitty kitty = new Kitty();
        kitty.name = "Bob";
        kitty.callMammy ="Miay";
//        System.out.println(kitty.name);
//        System.out.println(kitty.callMammy);
//        System.out.println(kitty.getCallMammy());

        Kitty kitty1 = new Kitty();
        kitty1.name = "Sam";
//        System.out.println(kitty1.name);
//        System.out.println(kitty1.callMammy);

        //инкапсуляция - доступ
        // геттеры - сеттеры


        //полиморфизм (@Override) переопределение
        Animal dog = new Dog();
        dog.voice();

        Animal cat = new Cat();
        cat.voice();
        System.out.println();

        Dog dog1 = new Dog();
        dog1.name = "Lord";
        System.out.println(dog1.name);
        dog1.voice();

    }
}
