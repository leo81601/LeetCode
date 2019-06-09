package Array;

public class Search_in_Rotated_Sorted_Array_II {
    public boolean search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return false;
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (nums[middle] == target) return true;
            if (nums[left] < nums[middle] || nums[middle] > nums[right]){
                if (nums[left] <= target && target < nums[middle]) {
                    right = middle - 1;
                }else {
                    left = middle + 1;
                }
            }else if (nums[middle] < nums[right] || nums[left] > nums[middle]){
                if (nums[middle] <= target && target <= nums[right]){
                    left = middle + 1;
                }else {
                    right = middle - 1;
                }
            }else {
                left++;
                right--;
            }
        }
        return false;
    }
}
