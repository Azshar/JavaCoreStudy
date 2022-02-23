package lesson5HomeWork;

public class Main {
    public static void main(String[] args) {
        Employee [] employees = new Employee[5];

        employees[0] = new Employee("Алексеев Алексей Алексеевич", "Team-leader", "alex@ya.ru", "+79998887766", 1000, 40);
        employees[1] = new Employee("Иванов Иван Иванович", "Mobile-developer", "ivan@ya.ru", "+79998886655", 600, 32);
        employees[2] = new Employee("Андреев Андрей Андреевич", "Backend-developer", "andre@ya.ru", "+79998885544", 570, 29);
        employees[3] = new Employee("Сергеев Сергеев Сергеевич", "Frontend-developer", "serg@ya.ru", "+79998884433", 570, 45);
        employees[4] = new Employee("Махмудов Махмуд Махмудович", "QA", "mah@ya.ru", "+79998883322", 450, 23);

        for (Employee employee : employees) {
            if (employee.age >= 40) {
                employee.getInfo();
            }
        }

    }
}
