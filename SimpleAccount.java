public class SimpleAccount extends Account {
    public SimpleAccount(long startBalance) {
        super(startBalance);
    }

    @Override
    public boolean add(long amount) {
        if (amount <= 0)
            return false;
        balance += amount;
            return true;
    }

    @Override
    public boolean pay(long amount) {
        if (amount <= 0)
            return false;
        if (amount <= balance) {
            balance -= amount;
            return true;
        } return false;
    }
}
