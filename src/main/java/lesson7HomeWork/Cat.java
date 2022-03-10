package lesson7HomeWork;

import java.util.concurrent.ThreadLocalRandom;

public class Cat {
    public String name;
    public boolean satiety = false;

    public Cat(String name) {
        this.name = name;
    }

    public boolean eat(Plate plate) {
        this.satiety = plate.decreaseFood(ThreadLocalRandom.current().nextInt(4) + 3);

        return this.satiety;


//        return plate.decreaseFood(ThreadLocalRandom.current().nextInt(4) + 3);
    }
}
