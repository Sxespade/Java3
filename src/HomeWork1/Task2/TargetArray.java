package HomeWork1.Task2;

import java.util.ArrayList;
import java.util.Collections;

public class TargetArray<T> {

    protected ArrayList<T> toArrayList(T[] arr) {
        ArrayList<T> al = new ArrayList<>();
        Collections.addAll(al, arr);
        return al;
    }

}
