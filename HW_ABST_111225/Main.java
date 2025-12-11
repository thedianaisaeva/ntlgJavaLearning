public class Main {
    public static void main(String[] args) {
        Account credit = new CreditAccount(50_000);
        Account simple = new SimpleAccount(10_000);

        simple.pay(2000);
        simple.pay(35000);
        simple.add(1000);
        simple.getBalance();

        credit.pay(32000);
        credit.add(4000);
        credit.pay(83000);
        credit.getBalance();

        credit.transfer(simple, 17999);
        credit.getBalance();
        simple.transfer(credit, 49000);
        simple.getBalance();
        credit.getBalance();
    }
}
