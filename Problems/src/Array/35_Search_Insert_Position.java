package Array;

/**
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 *
 * You may assume no duplicates in the array.
 *
 * Example:
 *
 * Input: [1,3,5,6], 5
 * Output: 2
 *
 * Related Topics: Array, Binary Search
 */

class Search_Insert_Position {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (nums[middle] == target) {
                return middle;
            }else if (nums[middle] < target) {
                left = middle + 1;
            }else {
                right = middle - 1;
            }
        }
        return left;
    }
}