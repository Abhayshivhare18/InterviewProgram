package prm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



public class StringPermutations {
	
	public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        int target = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int newTarget = target - nums[i];
            int li = i + 1;
            int ri = nums.length - 1;
            List<List<Integer>> lis = target(newTarget, li, ri, nums);
            for (List<Integer> list : lis) {
                list.add(nums[i]);
                set.add(new ArrayList<>(list)); // Create a new ArrayList and add it to the set
            }

        }
        return new ArrayList<>(set);
    }

    public List<List<Integer>> target(int target, int li, int ri, int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        while (li < ri) {
            int left = nums[li];
            int right = nums[ri];
            int sum = left + right;
            if (target == sum) {
                List<Integer> list1 = Arrays.asList(left, right);
                li++;
                ri--;
                list.add(list1);
            } else if (sum > target) {
                ri--;
            } else {
                li++;
            }
        }
        return list;
    }

    public static void main(String[] args) {
    	StringPermutations threeSum = new StringPermutations();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = threeSum.threeSum(nums);
        System.out.println(result);
    }

	    

}
