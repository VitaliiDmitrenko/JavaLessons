package homeWorks.Task9;

public class Family {
    public static void main(String[] args) {


        Person person1 = new Person("Nikol", "Female", 32);
        Person person2 = new Person("Nikola", "Male", 23);
        Person person3 = new Person("Stas", "Male", 8);

//        person2.personCard(person1.getName(), person1.getSex(), person1.getAge());
//        person2.personCard(person2.getName(), person2.getSex(), person2.getAge());
//        person2.personCard(person3.getName(), person3.getSex(), person3.getAge());
//
//
//        System.out.println(person1.isSameName("Frank"));
//        System.out.println(person2.isSameName("Frank"));


//        Person person1 = new Person("Nikol", "Female", 32);
//        Person person2 = new Person("Nikola", "Male", 23);
//        Person person3 = new Person("Stas", "Male", 8);

        Employee employee1 = new Employee(person1, 20000);
        Employee employee2 = new Employee(person2, 30000);
        Employee employee3 = new Employee("Anna", "Female", 32, 30000);

//        Employee[] employees = {employee1, employee2,employee3};
//
//        System.out.println(EmploeeUtilse.getSum(employees));
//
//        System.out.println(EmploeeUtilse.findByName("Anna", employees));
//        System.out.println(EmploeeUtilse.findBySubName("ri", employees));

        System.out.println(person1.getName());
     //   System.out.println(employee1.getName());

    }
}