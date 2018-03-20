package leetcode;

import java.util.Arrays;

/**
 * 242. Valid Anagram
 * @author Allen
 *
 */
public class Main242 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public boolean isAnagram(String s, String t) {
		char[] ch1=s.toCharArray();
		char[] ch2=t.toCharArray();
		if(ch1.length!=ch2.length)return false;
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		for(int i=0;i<ch1.length;i++){
			if(ch1[i]!=ch2[i])return false;
		}
		return true;
	}
}
