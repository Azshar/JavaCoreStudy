package lesson2HomeWork;

public class Main {
    public static void main(String[] args) {
        System.out.println(checkSum(10, 2));
        checkNumber(-1);
        System.out.println(checkNumberReturn(0));
        cycle(10, "Махмуд");
        System.out.println(checkYear(2022));
    }

    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     * */
    private static boolean checkSum (int value1, int value2) {
        final int sum = value1 + value2;

        return sum >= 10 && sum <= 20;
    }

    /**
     * 2. аписать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
     * положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
     * */
    private static void checkNumber (int value) {
        System.out.println(value >= 0 ? "Положительное число" : "Отрицательное число");
    }

    /**
     * 3. Написать метод, которому в качестве параметра передается целое число.
     * Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
     * */
    private static boolean checkNumberReturn (int value) {
        return value < 0;
    }

    /**
     * 4. Написать метод, которому в качестве аргументов передается строка и число,
     * метод должен отпечатать в консоль указанную строку, указанное количество раз;
     * */
    private static void cycle (int count, String string) {
        for (int i = 1; i <= count; i++) {
            System.out.println(string);
        }
    }

    /**
     * 5. * Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false).
     * Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
     **/
    private static boolean checkYear (int year) {
        for (int i = 0; i < year; i++) {
            System.out.println("Год " + i + ((i%4 == 0 || i%400 == 0) && i%100 != 0 ? " Високосный год" : " Невисокосный год"));
        }

        return (year%4 == 0 || year%400 == 0) && year%100 != 0;
    }
}
