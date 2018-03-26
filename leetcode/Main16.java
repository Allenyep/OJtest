package leetcode;

import java.util.Arrays;

/**
 * 16. 3Sum Closest
 * @author Allen
 *
 */

public class Main16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public int threeSumClosest(int[] nums, int target) {
		int result=nums[0]+nums[1]+nums[nums.length-1];
		Arrays.sort(nums);
		for(int i=0;i<nums.length-2;i++){
			int start=i+1,end=nums.length-1;
			while (start < end) {
				int sum = nums[i] + nums[start] + nums[end];
				if(sum>target){
					end--;
				}else 
					start++;
				if(Math.abs(sum - target) < Math.abs(result - target))
					result=sum;
			}
		}
		
		return result;
    }

}
