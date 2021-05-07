package lessons.Less1_9;

public class Less900 {
    public static void main(String[] args) {
        Less90 a = new Less90();
        a.setAccountBalance(150.15);

        Less90 b = new Less90();
        b.setAccountBalance(380.75);

        Less90.setInterestRate(3.75);

        System.out.println("First bank account: " + a.getAccountBalance());
        System.out.println("Second bank account: " + b.getAccountBalance());
        System.out.println("Interest rate: " + Less90.getInterestRate());

        Less90.setInterestRate(5.95);

        System.out.println("First bank account: " + a.getAccountBalance());
        System.out.println("Second bank account: " + b.getAccountBalance());
        System.out.println("Interest rate: " + Less90.getInterestRate());

    }
}
