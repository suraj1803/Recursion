package recursion;

public class MaxOfArray {
    public static void main(String[] args) {
        System.out.println(findMax(new int[]{5, 10, 2, 20}, 0));;
    }

    public static int findMax(int[] arr, int i) {
        if (i == arr.length - 1)
            return arr[i];
        int tempMax = findMax(arr, i + 1);
        return Math.max(arr[i], tempMax);
    }
}
