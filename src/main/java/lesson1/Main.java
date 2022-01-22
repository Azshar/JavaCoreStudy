package lesson1;

public class Main {
    public static void main(String [] args) {
        System.out.println("Hello World");

        printHelloWorld("Test");

        testVars();
    }

    static void printHelloWorld (String str) {
        System.out.println(str);
    }

    private static void testVars() {
        int testVar = 9;
        int testVarTwo = 5;

        double arithmetic = (double) testVar / testVarTwo;

        System.out.println(arithmetic);

    }

    private static void testAppraisal(int appraisal) {
        System.out.println("Студент принес оценку: " + appraisal);

        if (appraisal == 5) {
            System.out.println("Красаучег!");
        } else if (appraisal == 4) {
            System.out.println("Not bad, чувак!");
        } else {
            System.out.println("Ты шо гонишь?");
        }

        System.out.println("Проверка окончена!");

    }
}
