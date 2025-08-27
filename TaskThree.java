import java.util.Scanner;

public class TaskThree {
    public static int calculateCustoms(int priceRate, int weightRate, int price, int weight) {
        int totalCustoms = (price / priceRate) + (weightRate * weight);
        return totalCustoms;
    }

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Здравстуйте!");
            System.out.print("Введите стоимость товара (в руб.): ");
            int price = scanner.nextInt();
            System.out.print("Введите вес товара (в кг): ");
            int weight = scanner.nextInt();
            int customs = calculateCustoms(100, 100, price, weight);
            System.out.print("Размер пошлины составит (в руб.): " + customs);
    }
}
