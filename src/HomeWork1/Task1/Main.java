package HomeWork1.Task1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String[] arr = new String[] {"a","b"};
        TargetArray<String> ta = new TargetArray<>(arr);

        System.out.println(Arrays.toString(arr));
        ta.swap(0,-2);
        System.out.println(Arrays.toString(arr));
    }
}
