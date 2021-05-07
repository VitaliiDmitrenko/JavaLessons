package classes;

public class Main {
    public static void main(String[] args) {

        Car h = new Car("Honda");

 /*       Person a = new Person("Vitalii",32,'M', h);
//        a.name = "Vitalii";
//        a.age = 32;
//        a.sex = 'M';

        Person b = new Person("Anna", 27, 'F');
//        b.name = "Anna";
//        b.age = 27;
//        b.sex = 'F';

//        String name = a.getName();
//
//        System.out.println(name);
//        System.out.println(a.isChild());
        System.out.println(a.car.name);
        System.out.println(b.age); */
        Person a = new Person();
        a.setName("Vitalii");
        a.setAge(37);
        a.setSex('M');

        Person b = new Person();
        b.setName("Anna");
        b.setAge(27);
        b.setSex('F');


        System.out.println(a.name);
        System.out.println(b.name);
    }
}
