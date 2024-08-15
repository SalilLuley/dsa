package Sorting.Recursion;


public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{
                4,3,8,4,6,5
//            760, 337, 720, 182, 724, 719, 278, 612, 647, 370, 216, 96, 36, 458, 532, 177
//              552, 95, 337, 413, 899, 784, 962, 432, 275, 586, 810, 685, 267, 814, 13, 190, 67, 201, 164, 657, 462, 313, 310, 366, 848, 375, 751, 751
        };
        quickSort(arr, 0, arr.length-1);
        for (int j : arr) {
            System.out.println(j);
        }
    }

    public static void quickSort(int[] input, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return;
        }
        int pivot = partition(input, startIndex, endIndex);
        quickSort(input, startIndex, pivot - 1);  // Fixed the recursive call here
        quickSort(input, pivot + 1, endIndex);
    }
    public static int partition(int[] input, int startIndex, int endIndex) {
        int pivot = input[startIndex];
        int i = startIndex + 1;

        for (int j = startIndex + 1; j <= endIndex; j++) {  // Adjust the loop to work with endIndex
            if(input[j] <= pivot) {
                swap(input, i, j);
                i++;
            }
        }

        //Swap pivot to correct position
        swap(input, startIndex, i-1);
        return i-1;
    }

    public static void swap(int[] input, int i, int j){
        int holder = input[j];
        input[j] = input[i];
        input[i] = holder;
    }

}
