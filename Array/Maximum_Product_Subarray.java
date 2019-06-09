package Array;

public class Maximum_Product_Subarray {
    public int maxProduct(int[] nums) {
        int finalMax = nums[0], max = nums[0], min = nums[0];
        for (int i = 1; i < nums.length; i++){
            int maxTemp = Math.max(max * nums[i], min * nums[i]);
            int minTemp = Math.min(max * nums[i], min * nums[i]);
            max = Math.max(maxTemp, nums[i]);
            min = Math.min(minTemp, nums[i]);
            finalMax = Math.max(finalMax, max);
        }
        return finalMax;
    }
}
