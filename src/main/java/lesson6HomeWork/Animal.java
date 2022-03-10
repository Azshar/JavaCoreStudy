package lesson6HomeWork;

public class Animal {
    protected String name;
    protected static int count;

    public Animal(String name) {
        this.name = name;
        count++;
    }

    protected void run (int distance) {
        System.out.println(this.name + " пробежал " + distance + " метров");
    }

    protected void swim (int distance) {
        System.out.println(this.name + " проплыл " + distance + " метров");
    }

    protected int result () {
        return count;
    }
}
