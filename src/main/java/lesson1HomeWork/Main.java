package lesson1HomeWork;

public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    private static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    private static void checkSumSign () {
        int a = 200;
        int b = -300;

        System.out.println((a + b) >= 0 ? "Сумма положительная" : "Сумма отрицательная");
    }

    private static void printColor () {
        int value = 101;
        String color;

        if (value <= 0) {
            color = "Красный";
        } else if (value > 0 && value <= 100) {
            color = "Желтый";
        } else {
            color = "Зеленый";
        }

        System.out.println(color);
    }

    private static void compareNumbers () {
        int a = 2;
        int b = 1;

        String result;

        if (a >= b) {
            result = "a >= b";
        } else {
            result = "a < b";
        }

        System.out.println(result);
    }
}
