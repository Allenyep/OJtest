package leetcode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 * 349. Intersection of Two Arrays
 * @author Allen
 *
 */
public class Main349 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 =new int[]{1, 2, 2, 1};
		int[] nums2 =new int[]{2,2};
		int[] nums3=intersection(nums1, nums2);
		for(int i:nums3){
			System.out.println(i);
		}
	}
	
	public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> result=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
        	set.add(nums1[i]);
        }
		
        for(int i=0;i<nums2.length;i++){
        	if(set.contains(nums2[i])){
        		result.add(nums2[i]);
        	}
        }
		int[] res=new int[result.size()];int i=0;
		for(Iterator<Integer> iter =result.iterator();iter.hasNext();){
			res[i++]=iter.next();
		}
        
		return res;
    }

}
