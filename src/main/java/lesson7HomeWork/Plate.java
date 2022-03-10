package lesson7HomeWork;

public class Plate {
    private int foodCount;

    public Plate(int foodCount) {
        this.foodCount = foodCount;
    }

    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Plate{" + "foodCount=" + foodCount + '}';
    }

    public void increaseFood(int food) {
        this.foodCount += food;
    }

    public boolean decreaseFood(int catEatFoodCount) {
        if (this.foodCount >= catEatFoodCount) {
            this.foodCount -= catEatFoodCount;

            return true;
        } else {
            return false;
        }
    }

    public int getFoodCount() {
        return foodCount;
    }
}
