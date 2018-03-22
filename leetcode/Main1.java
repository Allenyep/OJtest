package leetcode;

import java.util.HashMap;

/**
 * 1. Two Sum
 * @author Allen
 *
 */
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={3,3};
		int[] res=twoSum(nums, 6);
		System.out.println(res[0]+" "+res[1]);
	}
	public static int[] twoSum(int[] nums, int target) {
        int[] res=new int[2];
        HashMap<Integer, Integer> map=new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
        	int k=target-nums[i];
        	if(map.containsKey(k)){
        		res[1] = i + 1;
                res[0] = map.get(target - nums[i]);
                return res;
        	}
        	map.put(nums[i], i + 1);
        }
		return res;
    }
	

}
