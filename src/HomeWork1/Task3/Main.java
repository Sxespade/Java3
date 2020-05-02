package HomeWork1.Task3;

import HomeWork1.Task3.Fruit.Apple;
import HomeWork1.Task3.Fruit.Fruit;
import HomeWork1.Task3.Fruit.Orange;

public class Main {
    public static void main(String... args) {
        Box<Fruit> box1 = new Box<>();
        Box<Fruit> box2 = new Box<>();
        box1.addFruit(new Apple());
        box1.showFruits();
        box1.getWeight();
        System.out.println(box1.compare(box2));
        box1.transfer(box2);
        box1.showFruits();
        box2.showFruits();
    }
}
