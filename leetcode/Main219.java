package leetcode;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * 219. Contains Duplicate II
 * @author Allen
 *
 */
public class Main219 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={1,2,1};
		System.out.println(containsNearbyDuplicate(nums, 1));
	}
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        if(k>=nums.length){
        	for(int i=0;i<nums.length;i++){
            	if(!set.contains(nums[i])){
            		set.add(nums[i]);
            	}else{
            		return true;
            	}
            }
        }else{
        	for(int i=0;i<k+1;i++){
            	if(!set.contains(nums[i])){
            		set.add(nums[i]);
            	}else{
            		return true;
            	}
            }
            
            for(int i=k;i<nums.length-1;i++){
            	set.remove(nums[i-k]);
//            	System.out.println(set);
            	if(!set.contains(nums[i+1])){
            		set.add(nums[i+1]);
            	}else{
            		return true;
            	}
            }
        }
        
        
    	return false;
    }

    //优秀解法
    //Set 不允许放置重复元素
    public boolean containsNearbyDuplicate2(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(i > k) set.remove(nums[i-k-1]);
            if(!set.add(nums[i])) return true;
        }
        return false;
 }
}
