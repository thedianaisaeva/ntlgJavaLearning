import java.util.Scanner;
public class MainOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год в формате гггг: ");
        int year = scanner.nextInt();


        if (year % 100 == 0 && year % 400 == 0) {
            int yearDays = 366;
            System.out.println("Колчество дней: " + yearDays);
        } else if (year % 4 == 0) {
            int yearDays = 366;
            System.out.println("Колчество дней: " + yearDays);
        } else if (year % 100 > 0 && year % 400 > 0 && year % 4 > 0) {
            int yearDays = 365;
            System.out.println("Колчество дней: " + yearDays);
        }
    }
}
