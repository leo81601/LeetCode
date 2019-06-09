package Array;

public class Find_Minimum_in_Rotated_Sorted_Array {
    public int findMin(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        int left = 0, right = nums.length - 1;
        while (nums[left] > nums[right]){
            int middle = left + (right - left) / 2;
            if (nums[middle] > nums[right]){
                left = middle + 1;
            }else {
                right = middle;
            }
        }
        return nums[left];
    }
}
