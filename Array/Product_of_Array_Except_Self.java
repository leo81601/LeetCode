package Array;

public class Product_of_Array_Except_Self {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int[] ans = new int[nums.length];
        ans[0] = 1;
        for (int i = 1; i < ans.length; i++){
            product = product * nums[i - 1];
            ans[i] = product;
        }
        product = 1;
        for (int i = nums.length - 2; i >= 0; i--){
            product = product * nums[i + 1];
            ans[i] *= product;
        }
        return ans;
    }
}
