package Array;

import java.util.ArrayList;
import java.util.List;

public class Combination_Sum_III {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        if (k < 1 || n < 1) return ans;
        helper(ans, list, 0, k, n, 1);
        return ans;
    }

    private void helper(List<List<Integer>> ans, List<Integer> list, int sum, int k, int n, int level){
        if (sum == n && k == 0){
            ans.add(new ArrayList<>(list));
            return;
        }else if (sum > n || k <= 0){
            return;
        }
        for (int i = level; i <= 9; i++){
            list.add(i);
            helper(ans, list, sum + i, k - 1, n, i + 1);
            list.remove(list.size() - 1);
        }
    }
}
