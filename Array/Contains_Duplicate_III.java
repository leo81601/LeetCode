package Array;

import java.util.HashMap;

public class Contains_Duplicate_III {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (nums == null || nums.length == 0 || k <= 0 || t < 0) return false;
        int min = Integer.MAX_VALUE;
        for (int num : nums) min = Math.min(num, min);
        HashMap<Long, Integer> bucket = new HashMap<>();
        long diff = (long) t + 1;
        for (int i = 0; i < nums.length; i++){
            long index = ((long) nums[i] - (long) min) / diff;
            //Check left adjacent bucket
            Integer left_bucket = bucket.get(index - 1);
            if (left_bucket != null && Math.abs((long) nums[i] - (long) left_bucket) < diff) return true;
            //Check right adjacent bucket
            Integer right_bucket = bucket.get(index + 1);
            if (right_bucket != null && Math.abs((long) nums[i] - (long) right_bucket) < diff) return true;
            //Check current bucket
            Integer current_bucket = bucket.get(index);
            if (current_bucket != null) return true;
            bucket.put(index, nums[i]);
            if (i >= k) bucket.remove(((long) nums[i - k] - (long) min) / diff);
        }
        return false;
    }
}
