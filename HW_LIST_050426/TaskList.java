import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class TaskList {
    public static void main(String[] args) {
        List<String> taskList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean cycle = true;
        while (cycle) {
            programMenu();
            String command = sc.nextLine();
            switch (command) {
                case "0":
                    System.out.println("Программа завершена.");
                    cycle = false;
                    break;
                case "1":
                    System.out.println("Введите название задачи: ");
                    String inputTask = sc.nextLine();
                    taskList.add(inputTask);
                    System.out.println("Добавлено!");
                    showTaskList(taskList);
                    break;
                case "2":
                    showTaskList(taskList);
                    break;
                case "3":
                    System.out.println("Введите номер задачи для удаления: ");
                    int delete = Integer.parseInt(sc.nextLine())-1;
                    if (delete >= taskList.size() || delete < 0) {
                        System.out.println("Нет задачи с таким номером!");
                    } else {
                        taskList.remove(delete);
                        System.out.println("Удалено!");
                        showTaskList(taskList);
                    }
                    break;
                case "4":
                    System.out.println("Введите название задачи для удаления: ");
                    String taskName = sc.nextLine();
                    boolean check = taskList.contains(taskName);
                    if (check) {
                        taskList.remove(taskName);
                        System.out.println("Удалено!");
                        showTaskList(taskList);
                    } else {
                        System.out.println("Нет задачи с таким названием!");
                    }
                    break;
            }
        }
    }
    static void showTaskList(List<String> taskList) {
        if (taskList.isEmpty()) {
            System.out.println("Список задач пуст.\n");
            return;
        }
        System.out.println("Ваш список задач:");
        for (int i = 0; i < taskList.size(); i++) {
            System.out.println(i+1 + ". " + taskList.get(i));
        }
        System.out.println();
    }

    static void programMenu() {
        System.out.println("Выберите операцию:\n" +
                "0. Выход из программы\n" +
                "1. Добавить задачу\n" +
                "2. Показать задачи\n" +
                "3. Удалить задачу по номеру\n" +
                "4. Удалить задачу по названию\n" +
                "Ваш выбор: ");
    }
}
