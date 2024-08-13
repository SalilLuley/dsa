package Recursion;

//Problem statement
//Given an array of length N and an integer x, you need to find and return the first index of integer x present in the array. Return -1 if it is not present in the array.
//First index means, the index of first occurrence of x in the input array.
//Do this recursively. Indexing in the array starts from 0.

public class FirstIndex {
    public static void main(String[] args) {
        int[] arr = new int[] {1};
        int result = firstIndex(arr, 1);
        System.out.println(result);
    }

    public static int firstIndex(int[] input, int x) {
        return firstIndex(input, x, 0);
    }

    public static  int firstIndex(int[] input, int x, int startIndex) {
        if (startIndex >= input.length - 1 ) {
            return input[startIndex] == x ? startIndex : -1;
        }

        if (input[startIndex] == x) {
            return startIndex;
        }

        return firstIndex(input, x, startIndex +1);
    }
}
