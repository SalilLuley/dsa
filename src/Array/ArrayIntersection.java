package Array;

public class ArrayIntersection {
    public static void main(String[] args) {
        int[] arr = new int[]{6,9,8,5};
        int[] arr1 = new int[]{9,2,4,1,8};
        intersection(arr, arr1);
    }


    public static void intersection(int[] arr1, int[] arr2) {
        //Your code goes here
        int[] arr = getBubbleSort(arr1);
        boolean isMatch = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr[i] == arr2[j]) {
                    isMatch = true;
                    arr2[j] = -1;
                    break;
                }

            }
            if(isMatch) {
                System.out.print(arr[i] + " ");
            }
            isMatch = false;
        }
    }

    public static int[] getBubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
