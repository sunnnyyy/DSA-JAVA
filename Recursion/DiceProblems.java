package Recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * DiceProblems
 */
public class DiceProblems {

    public static void main(String[] args) {

        // printDices(6, 4, "");
        // List<String> L = new ArrayList<>();
        // L = returnDices(6, 4, "");
        // System.out.println(L);

        int arr[] = { 1, 2, 5 };
        List<Integer> L = new ArrayList<>();
        L = returnTotalPossibility(arr, 4, "");
        System.out.println(L);
        // System.out.println(L.get(0) instanceof Integer);

        // Find the minimum value in the integer list
        // int minValue = Collections.min(L);
        // System.out.println(minValue);
        // Convert the minimum integer value back to a string
        // String s = String.valueOf(minValue);
        // System.out.println(s);

        // int arr[] = {1,2,5};
        int ans = returnMinimumPossibility(arr, 4);
        if (ans == Integer.MAX_VALUE)
            ans = -1;
        System.out.println(ans);

        // IMP: solution will throw TLE have to use DP here
    }

    static int returnMinimumPossibility(int[] arr, int target) {
        if (target == 0) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length && arr[i] <= target; i++) {

            int val = (returnMinimumPossibility(arr, target - arr[i]));
            if (val != Integer.MAX_VALUE) {
                int count = 1 + val;
                min = Math.min(count, min);
            }
        }

        return min;
    }

    static List<Integer> returnTotalPossibility(int[] arr, int target, String str) {
        if (target == 0) {
            // List<String> s = new ArrayList<>();
            // s.add(str);
            // return s;
            str = str == "" ? "0" : str;
            return Arrays.asList(Integer.parseInt(str));
        }
        List<Integer> s1 = new ArrayList<>();
        for (int i = 0; i < arr.length && i <= target; i++) {
            // List<String> s2 = returnTotalPossibility(range, target - i, str + i);
            // s1.addAll(s2);
            s1.addAll(returnTotalPossibility(arr, target - arr[i], str + arr[i]));
        }
        return s1;
    }

    static List<String> returnDices(int range, int target, String str) {
        if (target == 0) {
            // List<String> s = new ArrayList<>();
            // s.add(str);
            // return s;
            return Arrays.asList(str);
        }
        List<String> s1 = new ArrayList<>();
        for (int i = 1; i < range && i <= target; i++) {
            // List<String> s2 = returnDices(range, target - i, str + i);
            // s1.addAll(s2);
            s1.addAll(returnDices(range, target - i, str + i));
        }
        return s1;
    }

    static void printDices(int range, int target, String str) {
        if (target == 0) {
            System.err.println(str);
            return;
        }

        for (int i = 1; i < range && i <= target; i++) {
            printDices(range, target - i, str + i);
        }
    }

}