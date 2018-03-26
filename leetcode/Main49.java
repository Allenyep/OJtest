package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * 49. Group Anagrams
 * @author Allen
 *
 */
public class Main49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs={"eat", "tea", "tan", "ate", "nat", "bat"};
		groupAnagrams(strs);
	}
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map=new HashMap<>();
        
        for(int i=0;i<strs.length;i++){
        	char[] tempchar=strs[i].toCharArray();
        	Arrays.sort(tempchar);
        	
        	
        	//charÊý×é×ªString
        	String tempstr=String.valueOf(tempchar);
        	
        	if(map.get(tempstr)!=null){
        		map.get(tempstr).add(strs[i]);
        	}else{
        		List<String> templist=new ArrayList<>();
        		templist.add(strs[i]);
        		map.put(tempstr, templist);
        	}
        	
        }
        List<List<String>> res=new ArrayList<>();
        for(List<String> s:map.values()){
        	res.add(s);
        }
//        System.out.println(res);
    	
    	return res;
    }

}
