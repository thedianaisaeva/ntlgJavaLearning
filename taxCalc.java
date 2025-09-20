import java.util.Scanner;

public class taxCalc {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int earnings = 0;
        int spendings = 0;

        boolean cycle = true;
        while (cycle) {
            ProgramMenu();
            String input = sc.nextLine();
            switch (input) {
                case "end":
                    System.out.println("Программа завершена.");
                    cycle = false;
                    break;
                case "1":
                    System.out.println("Введите сумму дохода:");
                    earnings += Integer.parseInt(sc.nextLine());
                    break;
                case "2":
                    System.out.println("Введите сумму расхода:");
                    spendings += Integer.parseInt(sc.nextLine());
                    break;
                case "3":
                    TaxSystemCalc(earnings, spendings);
                    break;
                default:
                    System.out.println("Такой операции нет.");
                    break;
            }

        }
    }
    static void TaxSystemCalc(int earnings, int spendings) {
        int tax6 = tax6calc(earnings);
        int tax15 = tax15calc(earnings, spendings);
        int minTax = Math.min(tax6, tax15);
        int maxTax = Math.max(tax6, tax15);
        String taxSystem = tax6 < tax15 ? "УСН доходы" : "УСН доходы минус расходы";

        if (tax6 == tax15) {
            System.out.println("Можете выбрать любую систему.");
            System.out.println("Ваш налог составит: " + minTax + " рублей");
            System.out.println("_________________________________________");
        } else {
            System.out.println("Мы советуем Вам: " + taxSystem);
            System.out.println("Ваш налог составит: " + minTax + " рублей");
            System.out.println("Налог на другой системе: " + maxTax + " рублей");
            System.out.println("Экономия: " + (maxTax - minTax) + " рублей");
            System.out.println("_________________________________________");
        }

    }
    static int tax6calc(int earnings) {
        return earnings * 6 / 100;
    }
    static int tax15calc(int earnings, int spendings) {
        int tax15check = (earnings - spendings) * 15 / 100;
        return Math.max(tax15check, 0);
    }

    static void ProgramMenu() {
        System.out.println("Выберите операцию и введите её номер:\n" +
                "1. Добавить новый доход\n" +
                "2. Добавить новый расход\n" +
                "3. Выбрать систему налогообложения");
    }
}
