package recursion_backtracking_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KeyPadCombination {
    static ArrayList<String> keys = new ArrayList<>(
            List.of(",;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz")
    );
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        ArrayList<String> result = getKPC(str);
        System.out.println(result);
    }

    public static ArrayList<String> getKPC(String str) { // 123
        if (str.isEmpty()) {
            ArrayList<String> temp = new ArrayList<>();
            temp.add("");
            return temp;
        }

        ArrayList<String> smallResult = getKPC(str.substring(1));
        // smallResult = [dg, dh, di, ef, eh, ei, fg, fh, fi]

        // index of the keys list
        int key = Integer.parseInt(String.valueOf(str.charAt(0)));

        String keyString = keys.get(key);

        int size = smallResult.size();
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < keyString.length(); i++) {
            for (int j = 0; j < size; j++) {
                result.add(keyString.charAt(i) + smallResult.get(j));
            }
        }

        return result;
    }
}
