package Array;

//Just Binary Search
public class Search_in_Rotated_Sorted_Array {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return -1;
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (nums[middle] == target) return middle;
            if (nums[left] < nums[middle] || nums[middle] > nums[right]){
                if (nums[left] <= target && target < nums[middle]){
                    right = middle - 1;
                }else {
                    left = middle + 1;
                }
            }else {
                if (nums[middle] <= target && target <= nums[right]){
                    left = middle + 1;
                }else {
                    right = middle - 1;
                }
            }
        }
        return -1;
    }
}
