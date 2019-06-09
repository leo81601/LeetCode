package Array;

public class Maximum_Subarray {
    public int maxSubArray(int[] nums) {
        int finalMax = nums[0], max = nums[0];
        for (int i = 1; i < nums.length; i++){
            max = Math.max(max + nums[i], nums[i]);
            finalMax = Math.max(finalMax, max);
        }
        return finalMax;
    }
}
