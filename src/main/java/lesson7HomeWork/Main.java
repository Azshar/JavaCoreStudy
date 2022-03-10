package lesson7HomeWork;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Cat cat = new Cat("Мартин Лютер Кот");
        Plate plate = new Plate(20);
        Plate plateForCats = new Plate(20);

        Cat[] cats = new Cat[10];

        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat("Кот № " + (i + 1));

            if (i == 5) {
                plateForCats.increaseFood(20);
            }

            if (cats[i].eat(plateForCats)) {
                System.out.println(cats[i].name + " Сыт");
            } else {
                System.out.println(cats[i].name + " Голоден");
            }
        }

        plate.printInfo();

        while (plate.getFoodCount() > 0) {
            if (cat.eat(plate)) {
                System.out.println("В миске достаточно еды!");
                System.out.println(cat.satiety);
                plate.printInfo();
                Thread.sleep(3000);
            } else {
                System.out.println("В миске недостаточно еды!");
                System.out.println(cat.satiety);
                break;
            }
        }
    }
}