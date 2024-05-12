package prm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StairCase {
	
	
	public static void main(String[] ars) {
		Scanner src = new Scanner(System.in);
		System.out.print("Please enter the value of target");
		int target = src.nextInt();
		
		int [] nums = {3,5,6,8,12,15,16,19,21};
		
		Arrays.sort(nums);
		
		int left=0;
		int right= nums.length-1;
		int mid =0;
		while(left<=right) {
			
			 mid = (left+right)/2;
			 if(nums[mid]==target) {
				  System.out.println("the index number is "+ mid);
				  break;
			 }else if(nums[mid]>target) {
				 right=mid-1;
				
			 }else {
				 left=mid+1;
			 }
			
		}
		System.out.print( -1);
	
}
	
}
