package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets_II {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        if (nums == null || nums.length == 0) return ans;
        Arrays.sort(nums);
        helper(ans, list, nums, 0);
        return ans;
    }

    private void helper(List<List<Integer>> ans, List<Integer> list, int[] nums, int index){
        ans.add(new ArrayList<>(list));
        for (int i = index; i < nums.length; i++){
            if (i != index && nums[i] == nums[i - 1]) continue;
            list.add(nums[i]);
            helper(ans, list, nums, i + 1);
            list.remove(list.size() - 1);
        }
    }
}
