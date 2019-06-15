package Binary_Search;

/**
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
 *
 * (i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).
 *
 * You are given a target value to search. If found in the array return its index, otherwise return -1.
 *
 * You may assume no duplicate exists in the array.
 *
 * Your algorithm's runtime complexity must be in the order of O(log n).
 *
 * Example:
 *
 * Input: nums = [4,5,6,7,0,1,2], target = 0
 * Output: 4
 *
 * Related Topics: Array, Binary Search
 */

class Search_in_Rotated_Sorted_Array {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return -1;
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (nums[middle] == target) return middle;
            if (nums[left] < nums[middle] || nums[middle] > nums[right]) {
                if (nums[left] <= target && target <= nums[middle]) {
                    right = middle - 1;
                }else {
                    left = middle + 1;
                }
            }else {
                if (nums[middle] <= target && target <= nums[right]) {
                    left = middle + 1;
                }else {
                    right = middle - 1;
                }
            }
        }
        return -1;
    }
}