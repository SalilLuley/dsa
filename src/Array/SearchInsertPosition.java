package Array;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[]nums = new int[]{1,3,5,6};
        int target = 0;
        System.out.println(searchInsert(nums, target));
    }

    //1 3 5 6 2
    // r l     r
    //
    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while ( left <= right && nums[left] < target) {
            left++;
        }

        while(right >= left && nums[right] > target) {
            right--;
        }

        if (left > right || left == right) {
            return left;
        } else {
            return  left - right;
        }
    }
}
