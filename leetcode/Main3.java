package leetcode;

/**
 * Longest Substring Without Repeating Characters
 * ÖØ¸´×Ö·û´® 256Êý×é
 * @author Allen
 *
 */
public class Main3 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLongestSubstring("abcabcbb"));;
	}
	
	public static int lengthOfLongestSubstring(String s) {
		int[] freq=new int[256];
		int l=0,r=-1;
		int res=0;
		
		while(l<s.length()){
			
			if(r+1<s.length()&&freq[s.charAt(r+1)]==0){
				freq[s.charAt(++r)]++;
			}
			else{
				freq[s.charAt(l++)]--;
			}
			res=Math.max(res, r-l+1);
		}
		
		return res;
	}

}
