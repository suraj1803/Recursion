package recursion_backtracking_1;

public class FirstOccurrence {
    public static void main(String[] args) {
        System.out.println(findFirstOccurrence(new int[]{1, 2, 3, 3, 4, 5, 4, 4}, 5, 0));
    }

    public static int findFirstOccurrence(int[] arr, int x, int i) {
        if (i == arr.length)
            return -1;

        if (arr[i] == x)
            return i;

        return findFirstOccurrence(arr, x, i + 1);
    }
}
