package Recursion;

public class CheckNumberIsPresent {
    public static void main(String[] args) {
        int [] arr = new int[]{1,2,3,4,5};
        boolean resultIsNotPresent = checkNumber(arr, 6);
        boolean resultIsPresent = checkNumber(arr, 4);
        System.out.println(resultIsPresent + " " + resultIsNotPresent);
    }

    public static  boolean checkNumber(int[] input, int x) {
       return findNumber(input, input.length, x);
    }

    public static boolean findNumber(int[] input, int size, int x) {
        if (size == 0 ) {
            return false;
        }
        if ( input[size - 1] == x) {
            return true;
        }
        return findNumber(input, size - 1, x);
    }

}
