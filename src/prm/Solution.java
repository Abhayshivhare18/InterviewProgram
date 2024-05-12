package prm;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] nums = {1,2,3};
       nextPermutation(nums);
	}
	
	 public static void nextPermutation(int[] nums) {
	        // 1 2 3,4,5
	        // 1 2,3,5,4

	        // 3 2 1
	        // 1,2,3
	        // 2,1,3

	        // 1,1,5
	        // 1,5,1
	        // 1,1,5

	        int length = nums.length - 1;
	        for (int i = length; i > 0; i--) {

	            if (nums[i] > nums[i - 1]) {
	                swap(i, i - 1, nums);
	                break;
	            }

	        }
	      //  Arrays.sort(nums);
	       for(int i=0; i<nums.length; i++) {
	    	   System.out.print(nums[i]+ "  ");
	       }
	    }

	    public static void swap(int left, int right, int[] nums) {
	        int tem = nums[left];
	        nums[left] = nums[right];
	        nums[right] = tem;
	    }
    
	     
}
