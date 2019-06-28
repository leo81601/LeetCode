package Sort;

/**
 * Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white and blue.
 *
 * Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
 *
 * Note: You are not suppose to use the library's sort function for this problem.
 *
 * Example:
 *
 * Input: [2,0,2,1,1,0]
 * Output: [0,0,1,1,2,2]
 *
 * Related Topics: Array, Two Pointers, Sort
 */

class Sort_Colors {
    public void sortColors(int[] nums) {
        int left = 0, right = nums.length - 1, index = 0;
        while (index <= right) {
            if (nums[index] == 0) {
                swap(nums, index, left);
                index++;
                left++;
            } else if (nums[index] == 1) {
                index++;
            }else {
                swap(nums, index, right);
                right--;
            }
        }
    }

    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}