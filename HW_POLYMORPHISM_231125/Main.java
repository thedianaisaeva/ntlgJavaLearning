import taxes.*;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("ПИРАМИДА", new Usn6());
        company.shiftMoney(85000);
        company.shiftMoney(-35000);
        company.payTaxes();

        company.setTaxSystem(new Usn15());
        company.shiftMoney(150000);
        company.shiftMoney(-92000);
        company.payTaxes();

        company.shiftMoney(80000);
        company.shiftMoney(-92000);
        company.payTaxes();
    }
}
