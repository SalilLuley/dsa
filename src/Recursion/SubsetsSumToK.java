package Recursion;

public class SubsetsSumToK {

    public static void main(String[] args) {

        int[] arr = new int[]{1,2,3,4,5};
        int target = 9;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }


//        subsetsSumK(arr, 6);
    }

//    public static int[][] subsetsSumK(int input[], int k) {
//        // Write your code here
//    }


}
