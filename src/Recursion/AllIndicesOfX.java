package Recursion;

import java.util.ArrayList;
import java.util.List;

public class AllIndicesOfX {
    public static void main(String[] args) {
        int[] arr = new int[] {9,8,10,8,8};
        List<Integer> result = allIndexes(arr, 8);
        for (int j : result) {
            System.out.println(j);
        }
    }

    public static List<Integer> allIndexes(int[] input, int x) {
        List<Integer> list = new ArrayList<>();
        allIndexes(input, x, 0, list, 0);
        return  list;
    }

    public static List<Integer> allIndexes(int[] input, int x,int startIndex, List<Integer> result, int counter) {
        if (startIndex >= input.length) {
            return result;
        }

        if (input[startIndex] == x) {
            result.add(startIndex);
        }

        return allIndexes(input, x, startIndex + 1, result, counter);
    }


}
