package recursion_backtracking_1;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        toh(n, 'A', 'B', 'C');
    }

    public static void toh(int n, char a, char b, char c) {
        if (n == 0)
            return;

        toh(n - 1, a, c, b);
        System.out.println("Move disc " + n + " from " + a + " to " + b);
        toh(n - 1, c, b, a);
    }
}
