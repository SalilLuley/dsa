package Array;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        int res = removeDuplicates(nums);
        System.out.println(res);
    }

    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }
        int writeableIndex = 0;
        int i = 0;
        while (i < nums.length - 1) {
            if (nums[i] != nums[i + 1]) {
                writeableIndex++;
                nums[writeableIndex] = nums[i+1];
            }
            i++;

        }
        return writeableIndex+1;
    }
}

// writeableIndex = 0
//
//    [0,0,1,1,1,2,2,3,3,4]
//       i
// max != nums[i]
// nums[i] = max
