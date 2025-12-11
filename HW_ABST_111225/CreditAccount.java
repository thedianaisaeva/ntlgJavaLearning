public class CreditAccount extends Account {
    public long limit;
    public CreditAccount(long limit){
        super(0);
        this.limit = limit;
    }

    @Override
    public boolean add(long amount) {
        if (amount <= 0)
            return false;
        if (amount + balance <= 0) {
            balance += amount;
            return true;
        } else return false;
    }

    @Override
    public boolean pay(long amount) {
        if (amount <= 0)
            return false;
        if (balance - amount >= -limit) {
            balance -= amount;
            return true;
        } else return false;
    }
}
