package HomeWork1.Task1;

public class TargetArray<T> {

    private T[] arr;

    public TargetArray(T[] arr) {
        this.arr = arr;
    }

    public T[] getArr() {
        return arr;
    }

    protected void swap(int a, int b) {
        try {
            checkNumber(a,b);
            T buffer = arr[a];
            arr[a] = arr[b];
            arr[b] = buffer;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void checkNumber(int a, int b) throws Exception {
        if (a > arr.length - 1 || b > arr.length - 1 || a < 0 || b <0) {
            throw new Exception ("Введены неверные значения индексов массива");
        }
    }

}
