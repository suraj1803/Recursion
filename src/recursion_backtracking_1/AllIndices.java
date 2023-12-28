package recursion_backtracking_1;

import java.util.Arrays;

public class AllIndices {
    public static void main(String[] args) {
        int[] result = findAllIndices(new int[]{3, 1, 3, 2, 3, 2, 1, 2}, 2, 0, 0);
        System.out.println(Arrays.toString(result));
    }

    public static int[] findAllIndices(int[] arr, int x, int fsf, int i) {
        if (i == arr.length)
            return new int[fsf];

        if (arr[i] == x)
            fsf++;

        int[] result = findAllIndices(arr, x, fsf, i + 1);

        if (arr[i] == x)
            result[fsf - 1] = i;

        return result;
    }
}