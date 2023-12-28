package recursion_backtracking_1;

public class PrintArrayInReverse {
    public static void main(String[] args) {
        print(new int[]{1, 2, 3, 4}, 0);
    }

    public static void print(int[] arr, int i) {
        if (i == arr.length)
            return;

        print(arr, i + 1);

        System.out.println(arr[i]);
    }
}
