package leetcode;

import java.util.HashSet;
import java.util.TreeSet;

/**
 * 220. Contains Duplicate III
 * @author Allen
 *
 */
public class Main220 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
    	if (nums == null || nums.length == 0 || k <= 0) {
            return false;
        }
    	
    	TreeSet<Long> set = new TreeSet<>();
    	
    	int i=0;
    	while (i < nums.length) {
    		Long floor=set.floor((long)nums[i]);
    		Long ceiling = set.ceiling((long) nums[i]);
    		
    		if ((floor != null && nums[i] - floor <= t ) ||
    				(ceiling != null && ceiling - nums[i] <= t)) {
    			return true;
    		}
    		set.add((long) nums[i++]);
    		if (i > k) {
    			set.remove((long) nums[i - k - 1]);
    		}
    	}
    	
    	return false;
    }

}
