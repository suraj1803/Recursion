package recursion_backtracking_1;

import java.util.ArrayList;
import java.util.Scanner;

public class SubSequence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        ArrayList<String> result = getSubSequence(str);
        System.out.println(result);
    }

    public static ArrayList<String> getSubSequence(String str) {
        if (str.length() == 1) {
            ArrayList<String> temp = new ArrayList<>();
            temp.add(" ");
            temp.add(str);
            return temp;
        }

        ArrayList<String> temp = getSubSequence(str.substring(1));
        int size = temp.size();
        for (int i = 0; i < size; i++) {
            if (temp.get(i).equals(" "))
                temp.add(String.valueOf(str.charAt(0)));
            else
                temp.add(str.charAt(0) + temp.get(i));
        }

        return temp;
    }
}
