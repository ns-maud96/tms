package homework.homework8.task1;

import java.util.Objects;

public class Fish extends Animal {

    private int neighbors;

    public Fish(String name, int age, String colour, int neighbors) {
        super(name, age, colour);
        this.neighbors = neighbors;
    }

    public boolean isLonely() {
        if (neighbors > 0) {
            return false;
        }
        return true;
    }

    public void makeWishesComeTrue() {
        if (getColour().equalsIgnoreCase("золотая")) {
            System.out.println(getName() + " может исполнить любое желание");
        } else {
            System.out.println(getName() + " желание не исполнит, но успокоить может");
        }
    }

    @Override
    public void voice() {
        System.out.println("Буль-буль");
    }

    public int getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(int neighbors) {
        this.neighbors = neighbors;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "name=" + getName() +
                ", age=" + getAge() +
                ", colour=" + getColour() +
                ", neighbors=" + neighbors +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Fish fish = (Fish) o;
        return neighbors == fish.neighbors;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), neighbors);
    }
}
