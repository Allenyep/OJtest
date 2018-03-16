package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
/**
 * 438.Find All Anagrams in a String
 * @author Allen
 *
 */
public class Main438 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findAnagrams("cbaebabacd","abc"));
	}

	//暴力 时间复杂度高
	public static List<Integer> findAnagrams2(String s, String p) {
        char[] chp=p.toCharArray();
        
        Arrays.sort(chp);
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<s.length()-p.length()+1;i++){
        	boolean flag=true;
        	char[] temp=new char[chp.length];
        	
        	for(int j=i;j<i+chp.length;j++){
        		temp[j-i]=s.charAt(j);
        		}
        	Arrays.sort(temp);
        	for(int k=0;k<chp.length;k++){
    			if(temp[k]!=chp[k]){
    				flag=false;
    			}
        	}
        	if(flag)
        		list.add(i);
        }
		
		return list;
    }
	
	//滑动窗口
	//"cbaebabacd"
	//"abc"
	public static List<Integer> findAnagrams(String s, String p) {
		HashMap<Character, Integer> map=new HashMap<>();
		for(char c:p.toCharArray()){
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		int l=0,r=p.length()-1;
		List<Integer> list=new ArrayList<>();
		
		while(l<s.length()-p.length()+1){
			boolean flag=true;
			for(int i=l;i<l+p.length();i++){
				//freq[s.charAt(i)]--;
			}
			
			if(flag)
				list.add(l);
			l++;r++;
		}
		
		return list;
	}
	
}
