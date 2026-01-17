import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalArgumentException {
        Scanner scanner = new Scanner(System.in);
        PasswordChecker checker = new PasswordChecker();

        try {
            System.out.print("Введите минимальную длину пароля: ");
            int minLength = Integer.parseInt(scanner.nextLine());
            checker.setMinLength(minLength);

            System.out.print("Введите максимальное количество повторений символа подряд: ");
            int maxRepeats = Integer.parseInt(scanner.nextLine());
            checker.setMaxRepeats(maxRepeats);

        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка! " + e.getMessage());
            return;
        }

        while (true) {
            System.out.print("Введите пароль (или end для выхода): ");
            String password = scanner.nextLine();

            if ("end".equals(password)) {
                System.out.println("Работа завершена");
                break;
            }

            boolean result;
            try {
                result = checker.verify(password);
            } catch (IllegalStateException e) {
                System.out.println("Ошибка: " + e.getMessage());
                break;
            }

            System.out.println(result
                    ? "Пароль подходит"
                    : "Пароль не подходит");
        }
    }
}
