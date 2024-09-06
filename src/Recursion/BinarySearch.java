package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5,6,7};
        int result = search(arr, 1);
        System.out.println(result);
    }


    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        return search(nums, target, start, end);
    }

    public static int search(int[] nums, int target, int start, int end) {
        if (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] > target) {
                return search(nums, target, start, mid-1);
            }

            return search(nums, target,mid+1, end);
        }

        return -1;
    }

}
