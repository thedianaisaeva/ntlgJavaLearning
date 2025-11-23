package taxes;

public class Usn6 extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        int taxSum = debit * 6 / 100;
        return taxSum;
    }
}
