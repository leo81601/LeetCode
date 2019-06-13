package Two_Pointers;

import java.util.Arrays;

/**
 * Given an array nums of n integers and an integer target, find three integers in nums such that the sum is closest to target.
 * Return the sum of the three integers. You may assume that each input would have exactly one solution.
 *
 * Example:
 *
 * Given array nums = [-1, 2, 1, -4], and target = 1.
 *
 * The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 *
 * Related Topics: Array, Two Pointers
 */

class Three_Sum_Closest {
    public int threeSumClosest(int[] nums, int target) {
        int ans = nums[0] + nums[1] + nums[nums.length - 1];
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum > target) {
                    right--;
                }else if (sum < target) {
                    left++;
                }else {
                    return target;
                }
                if (Math.abs(target - sum) < Math.abs(target - ans)) ans = sum;
            }
        }
        return ans;
    }
}