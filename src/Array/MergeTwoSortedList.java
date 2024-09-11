package Array;

import java.util.Arrays;

public class MergeTwoSortedList {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,4,5};
        int[] arr1 = new int[]{1,3,4};
        System.out.println(Arrays.toString(mergeTwoLists(arr, arr1)));
    }

    public static int[] mergeTwoLists(int[] list1, int[] list2) {
        int i = 0;
        int k = 0;
        int[] result = new int[list1.length+list2.length];
        for (int j = 0; j < list1.length + list2.length; j++) {
            if (i< list1.length && k < list2.length){
                if(list1[i] > list2[k]) {
                    result[j] = list2[k];
                    k++;
                } else {
                    result[j] = list1[i];
                    i++;
                }
            }
        }
        return  result;
    }
}
