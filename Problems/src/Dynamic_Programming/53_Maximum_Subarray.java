package Dynamic_Programming;

/**
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 *
 * Example:
 *
 * Input: [-2,1,-3,4,-1,2,1,-5,4],
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 *
 * Related Topics: Array, Divide and Conquer, Dynamic Programming
 */

class Maximum_Subarray {
    public int maxSubArray(int[] nums) {
        int finalMax = nums[0], max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            max = Math.max(nums[i], max + nums[i]);
            finalMax = Math.max(max, finalMax);
        }
        return finalMax;
    }
}