import java.util.Arrays;
import java.util.Scanner;
public class Shop {
    public static void main(String[] args) {
        String[] products = {"Хлеб", "Бананы", "Макароны", "Кетчуп"};
        int[] prices = {30, 280, 45, 60};
        String[] metrics = {"шт", "кг", "шт", "шт"};
        int sumProducts = 0;
        int[] cart = new int[products.length];

        Menu(products, prices, metrics);
        customer(cart);
        cartSum(cart, prices, products, metrics);
    }
    public static void customer(int cart[]) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Введите номер товара и количество или нажмите end");
            String input = sc.nextLine();
            if (input.equals("end")) {
                break;
            }
            String[] NumberAndQuantity = input.split(" ");
            int number = Integer.parseInt(NumberAndQuantity[0]);
            int quantity = Integer.parseInt(NumberAndQuantity[1]);
            cart[number - 1] += quantity;
        }
    }
    public static void cartSum(int[] cart, int[] prices, String[] products, String[] metrics) {
        int[] productSum = new int[cart.length];
        for (int x = 0; x < prices.length; x++) {
            productSum[x] = cart[x] * prices[x];
        }
        System.out.println("Ваша корзина:");
        int totalSum = 0;
        for (int y = 0; y < cart.length; y++) {
            System.out.printf("%d. %s - %d %s (%d руб/%s) - %d руб в сумме\n",
                    y + 1, products[y], cart[y], metrics[y], prices[y], metrics[y], productSum[y]);
            totalSum += productSum[y];

        }
        System.out.printf("Итого: %d руб", totalSum);
    }
    public static void Menu(String[] products, int[] prices, String[] metrics) {
        System.out.println("Список возможных товаров для покупки:");
        for (int i = 0; i < products.length; i++) {
            System.out.printf("%d. %s - %d руб/%s\n", i + 1, products[i], prices[i], metrics[i]);
        }
    }
}