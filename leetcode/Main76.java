package leetcode;

/**
 * 76.Minimum Window Substring
 * @author Allen
 *
 */
public class Main76 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="a";
		String t="a";
		System.out.println(minWindow(s, t));
	}
	
	public static String minWindow(String s, String t) {
        int left=0,right=0,count=t.length();
        int minlen=Integer.MAX_VALUE,minStart=0;
        int[] hash=new int[256];
        String sb=new String();
        
        
        //Îªt¸³Öµ
        for(int i=0;i<t.length();i++){
        	hash[t.charAt(i)]++;
        }
        
        while(right<s.length()){
        	if(count>0&&hash[s.charAt(right++)]-->=1)count--;
        	
        	while(count==0){
        		if(minlen>right-left){
        			minlen=right-left;
        			minStart=left;
        		}
        		if(hash[s.charAt(left)]++ >= 0){
        			count++;
        		}
        		left++;
        	}
        }
        
        
		return minlen==Integer.MAX_VALUE?"":s.substring(minStart, minStart+minlen);
    }

}
