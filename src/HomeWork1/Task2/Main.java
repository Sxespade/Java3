package HomeWork1.Task2;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] arr = new String[] {"a","b"};

        System.out.println(arr.getClass());

        TargetArray<String> ta = new TargetArray<>();
        ArrayList<String> al = ta.toArrayList(arr);

        System.out.println(al.getClass());

    }
}
