package homeWorks.Task9;

public class Person {
    private String name;
    private String sex;
    private int age;

    public Person(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {

        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public void personCard (String name, String sex, int age){
        if (age <= 16){
            System.out.println("Chld. " + name);
        }
        else if (sex.equals("Male")){
            System.out.println( "Mr. " + name);
        }else if (sex.equals("Female")){
            System.out.println("Mrs. " + name);
        }
        else System.out.println("Enter correct data");
    }
    public boolean isSameName (String name){
        return name.equals(getName());
    }
}
