package Array;

import java.util.ArrayList;
import java.util.List;

//Using BackTracking Algorithm
public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        if (nums.length == 0 || nums == null) return ans;
        helper(ans, list, nums, 0);
        return ans;
    }

    private void helper(List<List<Integer>> ans, List<Integer> list, int[] nums, int index){
        ans.add(new ArrayList<>(list));
        for (int i = index; i < nums.length; i++){
            list.add(nums[i]);
            helper(ans, list, nums, i + 1);
            list.remove(list.size() - 1);
        }
    }
}
