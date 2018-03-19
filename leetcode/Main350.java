package leetcode;

import java.util.ArrayList;
import java.util.HashMap;


/**
 * 350. Intersection of Two Arrays II666
 * @author Allen
 *
 */
public class Main350 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1=new int[]{1, 2, 2, 1};
		int[] nums2=new int[]{2,2};
		
		for(int i:intersect(nums1, nums2)){
			System.out.println(i);
		}
		
	}
	
    public static int[] intersect(int[] nums1, int[] nums2) {
    	HashMap<Integer, Integer> map1=new HashMap<>();
    	ArrayList<Integer> result=new ArrayList<>();
    	
    	for(int i=0;i<nums1.length;i++){
    		if(!map1.containsKey(nums1[i])){
    			map1.put(nums1[i], 1);
    		}else{
    			map1.put(nums1[i], map1.get(nums1[i])+1);
    		}
    	}
    	
//    	System.out.println(map1);
    	for(int i=0;i<nums2.length;i++){
    		if(map1.containsKey(nums2[i])&&map1.get(nums2[i])>0){
    			map1.put(nums2[i], map1.get(nums2[i])-1);
    			result.add(nums2[i]);
    		}
    	}
    	int[] resarr=new int[result.size()];
    	int j=0;
    	for(int i:result){
    		resarr[j++]=i;
    	}
    	
    	
        return resarr;
    }

}
