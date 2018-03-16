package leetcode;
/**
 * 209:minimum size subarray sum
 * »¬¶¯´°¿Ú
 * @author Allen
 *
 */
public class Main209 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(minSubArrayLen(7, new int[]{2,3,1,2,4,3}));;
	}
	
	public static int minSubArrayLen(int s,int[] nums){
		int l=0,r=-1;
		int sum=0;
		int result=nums.length+1;
		
		
		while(l<nums.length){
			if(r+1<nums.length&&s>sum){
				sum+=nums[++r];
			}else{
				sum-=nums[l++];
			}
			
			if(s<=sum){
				result=Math.min(result, r-l+1);
			}
			
		}
		if(result==nums.length+1)
			result=0;
		
		
		return result;
	}

}
