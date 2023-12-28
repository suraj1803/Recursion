package recursion;

public class FirstOccurrence {
    public static void main(String[] args) {
        System.out.println(findFirstOccurrence(new int[]{1, 2, 3, 3, 4, 4, 4}, 4, 0));
    }

    public static int findFirstOccurrence(int[] arr, int x, int i) {
        if (i == arr.length)
            return -1;

        int result = findFirstOccurrence(arr, x, i + 1);
        // result can be -1 or a particular index
        // if the current index is equal to x return the current index
        // otherwise return the result

        if (arr[i] == x)
            return i;
        return result;
    }
}
