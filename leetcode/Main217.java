package leetcode;

import java.util.HashSet;

/**
 * 217. Contains Duplicate
 * @author Allen
 *
 */
public class Main217 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
        	if(!set.contains(nums[i])){
        		set.add(nums[i]);
        	}else{
        		return true;
        	}
        }
    	
    	return false;
    }
}
