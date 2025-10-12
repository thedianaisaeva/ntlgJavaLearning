import java.util.Random;
import java.util.Scanner;

public class MatrixRotate {
    public static final int SIZE = 8;

    public static void main(String[] args) {
        int[][] colors = new int[SIZE][SIZE];
        int[][] rotate = new int[SIZE][SIZE];

        createMatrix(colors);
        showMatrix(colors);
        showMenu();
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        switch (input) {
            case 1:
                matrixRotate90(colors, rotate);
                showMatrix(rotate);
                break;
            case 2:
                matrixRotate180(colors, rotate);
                showMatrix(rotate);
                break;
            case 3:
                matrixRotate270(colors, rotate);
                showMatrix(rotate);
                break;
            default:
                System.out.println("Такой команды нет");
        }
    }

    private static void showMenu() {
        System.out.println("Введите номер команды:\n" +
                "1. Поворот на 90 градусов\n" +
                "2. Поворот на 180 градусов\n" +
                "3. Поворот на 270 градусов\n");
    }

    public static void createMatrix(int[][] colors) {
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                colors[i][j] = random.nextInt(256);
            }
        }
    }

    public static void showMatrix(int[][] colors) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", colors[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int[][] matrixRotate90(int[][] colors, int[][] rotate) {
        for (int x = 0; x < SIZE; x++) {
            for (int y = 0; y < SIZE; y++) {
                rotate[x][y] = colors[SIZE - 1 - y][x];
            }
        }
        return rotate;
    }

    public static int[][] matrixRotate180(int[][] colors, int[][] rotate) {
        for (int x = 0; x < SIZE; x++) {
            for (int y = 0; y < SIZE; y++) {
                rotate[x][y] = colors[SIZE - 1 - x][SIZE - 1 - y];
            }
        }
        return rotate;
    }

    public static int[][] matrixRotate270(int[][] colors, int[][] rotate) {
        for (int x = 0; x < SIZE; x++) {
            for (int y = 0; y < SIZE; y++) {
                rotate[x][y] = colors[y][SIZE - 1 - x];
            }
        }
        return rotate;
    }
}
