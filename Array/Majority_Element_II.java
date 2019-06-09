package Array;

import java.util.ArrayList;
import java.util.List;

//Moore voting Algorithm
public class Majority_Element_II {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int candidate1 = 0, candidate2 = 0, counter1 = 0, counter2 = 0;
        for (int num : nums){
            if (candidate1 == num){
                counter1++;
            }else if (candidate2 == num){
                counter2++;
            }else if (counter1 == 0){
                candidate1 = num;
                counter1 = 1;
            }else if (counter2 == 0){
                candidate2 = num;
                counter2 = 1;
            }else {
                counter1--;
                counter2--;
            }
        }
        counter1 = 0;
        counter2 = 0;
        for (int num : nums) {
            if (num == candidate1) {
                counter1++;
            } else if (num == candidate2) {
                counter2++;
            }
        }
        if (counter1 > nums.length / 3) list.add(candidate1);
        if (counter2 > nums.length / 3) list.add(candidate2);
        return list;
    }
}
