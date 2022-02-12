package lesson5HomeWork;

public class Employee {
    String name;
    String position;
    String email;
    String phone;
    Integer salary;
    Integer age;

    public Employee(String name, String position, String email, String phone, Integer salary, Integer age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void getInfo () {
        System.out.printf("ФИО сотрудника: %s \n" +
                "Должность сотрудника: %s \n" +
                "Email сотрудника: %s \n" +
                "Телефон сотрудника: %s \n" +
                "Зарплата сотрудника: %d \n" +
                "Возраст сотрудника: %d \n" +
                "______________________ \n",
                this.name,
                this.position,
                this.email,
                this.phone,
                this.salary,
                this.age);

    }
}
