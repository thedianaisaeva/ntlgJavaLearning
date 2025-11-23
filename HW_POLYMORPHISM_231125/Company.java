import taxes.TaxSystem;

public class Company {
    private String title;
    private TaxSystem taxSystem;
    private int debit;
    private int credit;

    public Company(String title, TaxSystem taxSystem) {
        this.title = title;
        this.taxSystem = taxSystem;
    }

    public void shiftMoney(int amount) {
        if (amount > 0) {
            debit += amount;
        } else {
            credit += Math.abs(amount);
        }
    }

    public void payTaxes() {
        int taxTotal = taxSystem.calcTaxFor(debit, credit);
        System.out.printf("Компания %s уплатила налог в размере: %d руб.\n", title, taxTotal);
        debit = 0;
        credit = 0;
    }

    public void setTaxSystem(TaxSystem taxSystem) {
        this.taxSystem = taxSystem;
    }
}
