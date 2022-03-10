package lesson6HomeWork;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Cat cat = new Cat("Кот " + i);
            Dog dog = new Dog("Пес " + i);

            cat.run(i * 10);
            cat.swim(i * 10);

            dog.run(i * 10);
            dog.swim(i * 10);
        }

        Animal animal = new Animal("Животное");
        Cat cat = new Cat("Барсик");
        Dog dog = new Dog("Бобик");

        System.out.println(dog.result());
        System.out.println(cat.result());
        System.out.println(animal.result());
    }
}
