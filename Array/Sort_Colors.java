package Array;

public class Sort_Colors {
    public void sortColors(int[] nums) {
        int left = 0, right = nums.length - 1, index = 0;
        while (index <= right) {
            if (nums[index] == 0){
                swap(nums, index, left);
                index++;
                left++;
            }else if (nums[index] == 1){
                index++;
            }else {
                swap(nums, index, right);
                right--;
            }
        }
    }

    private void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
