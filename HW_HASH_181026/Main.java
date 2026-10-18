import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Address ruEkat = new Address("Россия", "Екатеринбург");
        Address ruKazan = new Address("Россия", "Казань");
        Address belMinsk = new Address("Беларусь", "Минск");
        Address belBrest = new Address("Беларусь", "Брест");
        Address chnBeij = new Address("Китай", "Пекин");
        Address chnShan = new Address("Китай", "Шанхай");

        HashMap<Address, Integer> costPerAddress = new HashMap<>();
        costPerAddress.put(ruEkat, 20);
        costPerAddress.put(ruKazan, 15);
        costPerAddress.put(belMinsk, 22);
        costPerAddress.put(belBrest, 20);
        costPerAddress.put(chnBeij, 50);
        costPerAddress.put(chnShan, 56);

        Integer orderSumTotal = 0;
        boolean cycle = true;
        while (cycle) {
            System.out.println("Заполнение новго заказа.");
            System.out.println("Введите страну:");
            Scanner sc = new Scanner(System.in);
            String country = sc.nextLine();
            if (country.equals("end")) {
                System.out.println("Программа завершена.");
                cycle = false;
            } else {
                Address chosen =new Address(country, chooseCity());
                Integer weight = chooseWeight();
                if (costPerAddress.containsKey(chosen)) {
                    Integer price = costPerAddress.get(chosen);
                    Integer orderSum = price * weight;
                    orderSumTotal += orderSum;
                    System.out.println("Стоимость доставки составит: " + orderSum + " руб.");
                    System.out.println("Общая стоимость всех доставок: " + orderSumTotal + " руб.");
                    System.out.println();
                } else {
                    System.out.println("Нет доставки в указанный адрес.");
                    System.out.println();
                }
            }
        }
    }

    static String chooseCity() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите город:");
        String city = sc.nextLine();
        return city;
    }

    static int chooseWeight() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите вес (кг):");
        String conv = sc.nextLine();
        int weight = Integer.parseInt(conv);
        return weight;
    }
}
