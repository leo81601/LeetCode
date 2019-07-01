package Array;

/**
 * Given a sorted array nums, remove the duplicates in-place such that duplicates appeared at most twice and return the new length.
 *
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 *
 * Example:
 *
 * Given nums = [1,1,1,2,2,3],
 *
 * Your function should return length = 5, with the first five elements of nums being 1, 1, 2, 2 and 3 respectively.
 *
 * It doesn't matter what you leave beyond the returned length.
 *
 * Related Topics: Array, Two Pointers
 */

class Remove_Duplicates_from_Sorted_Array_II {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length;
        int countLength = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[countLength - 2]) {
                nums[countLength] = nums[i];
                countLength++;
            }
        }
        return countLength;
    }
}