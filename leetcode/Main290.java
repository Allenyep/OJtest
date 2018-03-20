package leetcode;

import java.util.HashMap;

/**
 * 290. Word Pattern
 * @author Allen
 *
 */
public class Main290 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern="e";
		String str="ererer";
		System.out.println(wordPattern(pattern, str));
	}
	public static boolean wordPattern(String pattern, String str) {
		if(pattern.length()==1)return true;
		if(pattern.length()==str.length())return false;
		if(!str.contains(" "))return false;
		String[] strs=str.split(" ");
		if(strs.length!=pattern.length())return false;
		HashMap<Character, String> map1=new HashMap<>();
		HashMap<String, Character> map2=new HashMap<>();
		for(int i=0;i<pattern.length();i++){
			if(!map1.containsKey(pattern.charAt(i))){
				map1.put(pattern.charAt(i), strs[i]);
			}else{
				if(!map1.get(pattern.charAt(i)).equals(strs[i])){
					return false;
				}
			}
		}
		for(int i=0;i<strs.length;i++){
			if(!map2.containsKey(strs[i])){
				map2.put(strs[i],pattern.charAt(i));
			}else{
				if(!map2.get(strs[i]).equals(pattern.charAt(i))){
					return false;
				}
			}
		}
		
		
		
//		System.out.println(map);
        return true;
    }

}
