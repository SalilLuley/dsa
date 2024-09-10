package Array;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5,6,7};
        rotate(arr, 6);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotate(int[] arr, int d) {
        //Your code goes here
        int[] temp = new int[arr.length+d];
        for (int i = 0; i < arr.length+d; i++) {
            if (i < arr.length) {
                temp[i] = arr[i];
            } else {
                temp[i] = 0;
            }
        }
        int k = 0;
        int j = 0;
        for (int i = d; i < temp.length; i++) {
            if (i < arr.length) {
                arr[k] = temp[i];
            } else {
                arr[k] = temp[j];
                j++;
            }

            k++;
        }
    }

}
