package Array;

import java.util.Arrays;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = new int[]{0,7,2,5,4,7,1,3,6};
        System.out.println(findDuplicate(arr));
    }

    public static int findDuplicate(int[] arr) {
        System.out.println(Arrays.toString(getBubbleSort(arr)));
        int duplicateNumber = arr[arr.length-1];
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] == arr[i+1]) {
                duplicateNumber=arr[i];
                i++;
            }
        }
        return duplicateNumber;
    }

    public static int[] getBubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
