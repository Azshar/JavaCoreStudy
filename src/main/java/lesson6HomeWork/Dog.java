package lesson6HomeWork;

public class Dog extends Animal {
    protected static int count;

    public Dog(String name) {
        super(name);
        count++;
    }

    @Override
    protected void swim(int distance) {
        if (distance <= 10) {
            super.swim(distance);
        } else {
            System.out.println("Песики не умеют так далеко плавать!");
        }
    }

    @Override
    protected void run(int distance) {
        if (distance <= 500) {
            super.run(distance);
        } else {
            System.out.println("Песики устали, чтобы так далеко бегать!");
        }
    }

    @Override
    protected int result() {
        return count;
    }
}
