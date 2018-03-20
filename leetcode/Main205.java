package leetcode;

import java.util.HashMap;

/**
 * 205. Isomorphic Strings
 * @author Allen
 *
 */
public class Main205 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ab";
		String t="aa";
		System.out.println(isIsomorphic(s, t));
	}
	
	public static boolean isIsomorphic(String s, String t) {
		HashMap<Character, Character> map1=new HashMap<>();
		HashMap<Character, Character> map2=new HashMap<>();
        for(int i=0;i<s.length();i++){
        	if(!map1.containsKey(s.charAt(i))){
        		map1.put(s.charAt(i), t.charAt(i));
        	}else{
        		if(map1.get(s.charAt(i))!=t.charAt(i)){
        			return false;
        		}
        	}
        }
        
        for(int i=0;i<t.length();i++){
        	if(!map2.containsKey(t.charAt(i))){
        		map2.put(t.charAt(i), s.charAt(i));
        	}else{
        		if(map2.get(t.charAt(i))!=s.charAt(i)){
        			return false;
        		}
        	}
        }
		
		return true;
    }
	
	/**
	 * Short Java solution without maps
	 * @param s1
	 * @param s2
	 * @return
	 */
	 public boolean isIsomorphic2(String s1, String s2) {
	        int[] m = new int[512];
	        for (int i = 0; i < s1.length(); i++) {
	            if (m[s1.charAt(i)] != m[s2.charAt(i)+256]) return false;
	            m[s1.charAt(i)] = m[s2.charAt(i)+256] = i+1;
	        }
	        return true;
	    }

}
