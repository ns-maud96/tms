package homework.homework8.task1;

import java.util.Objects;

public abstract class Animal {

    private int age;
    private String name;
    private String colour;

    public Animal(String name, int age, String colour) {
        this.name = name;
        this.age = age;
        this.colour = colour;
    }

    public abstract void voice();

    public void move() {
        System.out.println(getName() + "передвигается");
    }

    public int grow() {
        return getAge() + 1;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(name, animal.name) && Objects.equals(colour, animal.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, colour);
    }
}
