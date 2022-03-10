package lesson6HomeWork;

public class Cat extends Animal {
    protected static int count;

    public Cat(String name) {
        super(name);
        count++;
    }

    @Override
    protected void swim(int distance) {
        System.out.println("Котики не умеют плавать");
    }

    @Override
    protected void run(int distance) {
        if (distance <= 200) {
            super.run(distance);
        } else {
            System.out.println("Котики слишком ленивы, чтобы так далеко бегать!");
        }
    }

    @Override
    protected int result() {
        return count;
    }
}
