package lessons.Ticket;

public class BuyTicket {
    public static void main(String[] args) {

//        Ticket ticket = new Ticket();
//        ticket.setName("Sergio");
//        ticket.setSex('M');
//        ticket.setAge(300);
//        ticket.setPrice(100);
//
//        System.out.println("Ticket for: " + ticket.getName());
//        System.out.println("Ticket price: " + ticket.getPrice());

        Person person = new Person("Charley",30,'M');
        Employee employee = new Employee("Mary", 25, 'F',100);


        System.out.println(person.getName());
        System.out.println(employee.getName());

    }

}
