package classes;

public class Person {
    String name;
    int age;
    char sex;
    Car car;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
/*public Person(String name, int age, char sex, Car car) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.car = car;
    }
    public Person(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    String getName() {
        if (sex == 'M') {
            return "Mr. " + this.name;
        } else {
            return "Mrs. " + this.name;
        }
    }
        boolean isChild () {
            if (this.age >= 18){
                return false;
            }else {
                return true;
            }
        }*/



}
