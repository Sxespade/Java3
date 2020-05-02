package HomeWork1.Task3;

import HomeWork1.Task3.Fruit.Fruit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> {

    List<T> al;

    @SafeVarargs
    public Box(T... arr) {
        al = new ArrayList<>(Arrays.asList(arr));
    }

    public float getWeight() {
        if (al.size() == 0) return 0.0f;
        System.out.println(al.get(0).getWeight() * al.size());
        return al.get(0).getWeight() * al.size();
    }


    public void addFruit(T fruit) {
        al.add(fruit);
    }

    public void showFruits() {
        System.out.println(al.toString());
    }

    @SuppressWarnings("rawtypes")
    public boolean compare(Box another) {
        return Math.abs(this.getWeight() - another.getWeight()) < 0.00001;
    }


    public void transfer(Box<? super T> another) {
        another.al.addAll(this.al);
        this.al.clear();
    }

}
