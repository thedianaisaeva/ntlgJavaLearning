public abstract class Account {
    protected long balance;
    public long amount;

    public Account(long startBalance) {
        this.balance = startBalance;
    }

    public abstract boolean add(long amount);

    public abstract boolean pay(long amount);

    public boolean transfer(Account account, long amount) {
        if (this.pay(amount)) {
            if (account.add(amount)) {
                return true;
            } else {
                this.add(amount);
            }
        } return false;
    }

    public long getBalance() {
        System.out.println(balance);
        return balance;
    }
}
