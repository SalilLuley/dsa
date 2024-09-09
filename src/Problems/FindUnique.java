package Problems;

import java.util.Arrays;

public class FindUnique {
    public static void main(String[] args) {
        int [] arr = new int[]{1,7,7,2,1};
        System.out.println(findUnique(arr));
    }


//    public static int findUnique(int[] arr) {
//        int leastOccurance = arr[0];
//        boolean isPresent = false;
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                if (arr[i] == arr[j] && i != j) {
//                    isPresent = true;
//                }
//            }
//            if (!isPresent) {
//                leastOccurance = arr[i];
//            }
//            isPresent = false;
//        }
//        return leastOccurance;
//    }

    public static int findUnique(int[] arr) {
       //sort arr
        int leastOccurance = arr[arr.length - 1];
        for (int i = 0; i < arr.length -1 ; i++) {
            if (arr[i] != arr[i+1]) {
                leastOccurance = arr[i];
            } else {
                i++;
            }
        }
        return leastOccurance;
    }

    public static int[] getBubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return  arr;
    }
}
