package taxes;

public class Usn15 extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        int taxSum = (debit - credit) * 15 / 100;
        if (taxSum > 0) {
            return taxSum;
        } else {
            taxSum = 0;
        }
        return taxSum;
    }
}
