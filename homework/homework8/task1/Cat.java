package homework.homework8.task1;

import java.util.Objects;

public class Cat extends Animal {

    private int dailyAmountOfFood = 3;
    private int weight;

    public Cat(String name, int age, String colour, int weight) {
        super(name, age, colour);
        this.weight = weight;

    }

    public void eat() {
        if (dailyAmountOfFood > 0) {
            System.out.println(getName() + " поел");
            dailyAmountOfFood -= 1;
        } else {
            System.out.println(getName() + " уже все съел");
        }
    }

    public void isLazy() {
        if (getWeight() > 3) {
            System.out.println(getName() + " ленивый");
        } else {
            System.out.println(getName() + " тот еще непоседа");
        }
    }

    @Override
    public void voice() {
        System.out.println("Мяу!");
    }

    @Override
    public void move() {
        System.out.println();
    }

    public int getDailyAmountOfFood() {
        return dailyAmountOfFood;
    }

    public void setDailyAmountOfFood(int dailyAmountOfFood) {
        this.dailyAmountOfFood = dailyAmountOfFood;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name=" + getName() +
                ", age=" + getAge() +
                ", colour=" + getColour() +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return dailyAmountOfFood == cat.dailyAmountOfFood && weight == cat.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), dailyAmountOfFood, weight);
    }
}
