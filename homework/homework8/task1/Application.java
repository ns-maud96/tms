package homework.homework8.task1;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        List<Animal> fishes = new ArrayList<>();

        //создание объектов
        Animal cat1 = new Cat("Людовик", 7, "белый", 5);
        Animal cat2 = new Cat("Барсик", 4, "рыжий", 3);
        Cat cat3 = new Cat("Константин", 5, "черный", 2);

        Animal fish1 = new Fish("Немо", 1, "оранжево-белая", 2);
        Fish fish2 = new Fish("Блестяшка", 2, "золотая", 0);

        //проверка методов

        System.out.println(cat1.grow());
        cat2.voice();
        cat3.eat();
        cat3.eat();
        cat3.eat();
        cat3.eat();
        cat3.isLazy();
        fish1.voice();
        System.out.println(fish2.isLonely());
        fish2.makeWishesComeTrue();

        // проверка списков
        animals.add(cat1);
        animals.add(fish2);
        animals.add(cat2);
        animals.add(cat3);

        fishes.add(fish1);
        fishes.add(fish2);

        UtilList.printList(animals);
        UtilList.printList(fishes);
    }
}
