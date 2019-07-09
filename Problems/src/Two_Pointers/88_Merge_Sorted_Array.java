package Two_Pointers;

/**
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 *
 * Note:
 *
 * The number of elements initialized in nums1 and nums2 are m and n respectively.
 * You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
 * Example:
 *
 * Input:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 *
 * Output: [1,2,2,3,5,6]
 *
 * Related Topics: Array, Two Pointers
 */

class Merge_Sorted_Array {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int length = m + n;
        while (m - 1 >= 0 && n - 1 >= 0) {
            if (nums1[m - 1] > nums2[n - 1]) {
                nums1[length - 1] = nums1[m - 1];
                m--;
            }else {
                nums1[length - 1] = nums2[n - 1];
                n--;
            }
            length--;
        }
        while (m - 1 == -1 && n > 0) {
            nums1[length - 1] = nums2[n - 1];
            length--;
            n--;
        }
    }
}