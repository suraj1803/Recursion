package recursion_backtracking_1;

public class LastIndex {
    public static void main(String[] args) {
        System.out.println(findLastIndex(new int[]{3, 2, 1, 3, 1, 4, 1}, 4, 0));
    }

    public static int findLastIndex(int[] arr, int x, int i) {
        if (i == arr.length)
            return -1;

        int result = findLastIndex(arr, x, i + 1);
        if (result == -1 && arr[i] == x)
            result = i;
        return result;
    }
}
