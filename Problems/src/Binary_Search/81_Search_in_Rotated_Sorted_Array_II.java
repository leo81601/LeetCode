package Binary_Search;

/**
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
 *
 * (i.e., [0,0,1,2,2,5,6] might become [2,5,6,0,0,1,2]).
 *
 * You are given a target value to search. If found in the array return true, otherwise return false.
 *
 * Example:
 *
 * Input: nums = [2,5,6,0,0,1,2], target = 0
 * Output: true
 *
 * Related Topics: Array, Binary Search
 */

class Search_in_Rotated_Sorted_Array_II {
    public boolean search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return false;
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (nums[middle] == target) return true;
            if (nums[left] < nums[middle] || nums[middle] > nums[right]) {
                if (nums[left] <= target && target <= nums[middle]) {
                    right = middle - 1;
                }else {
                    left = middle + 1;
                }
            }else if (nums[left] > nums[middle] || nums[middle] < nums[right]) {
                if (nums[right] >= target && nums[middle] <= target) {
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