package Array;

public class Minimum_Size_Subarray_Sum {
    //O(n) Solution:
    public int minSubArrayLen(int s, int[] nums) {
        int left = 0, sum = 0, min = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++){
            sum += nums[right];
            while (sum >= s) {
                min = Math.min(min, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}

//O(nlogn) Solution:
//    public int minSubArrayLen(int s, int[] nums) {
//        int[] sum = new int[nums.length];
//        int minLen = Integer.MAX_VALUE;
//        if (nums.length != 0) sum[0] = nums[0];
//        for (int i = 1; i < nums.length; i++) sum[i] = sum[i - 1] + nums[i];
//        for (int i = 0; i < nums.length; i++)
//            if (sum[i] >= s)
//                minLen = Math.min(minLen, i - binarySearchLastIndexNotBiggerThanTarget(0, i, sum[i] - s, sum));
//        return minLen == Integer.MAX_VALUE ? 0 : minLen;
//    }
//    private int binarySearchLastIndexNotBiggerThanTarget(int left, int right, int target, int[] sum) {
//        while (left <= right) {
//            int mid = (left + right) >> 1;
//            if (sum[mid] > target) right = mid - 1;
//            else left = mid + 1;
//        }
//        return right;
//    }