package Array;

import java.util.HashMap;

public class Contains_Duplicate {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        if(nums.length == 0 || nums.length == 1) return false;
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                return true;
            }
        }
        return false;
    }
}
