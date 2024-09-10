package Array;

public class PairSumInArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7};
        int num = 9;
        System.out.println(pairSum(arr, num));
    }

    public static int pairSum(int[] arr, int num) {
        int pairs = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] + arr[j] == num) {
                    pairs++;
                }
            }
        }
        return pairs;
    }

}
