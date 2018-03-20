package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 451. Sort Characters By Frequency
 * @author Allen
 *
 */
public class Main451 {
	public static void main(String[] args) {
		System.out.println(frequencySort("tree"));
	}
	
    public static String frequencySort(String s) {
        HashMap<Character, Integer> map=new HashMap<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
        	if(!map.containsKey(s.charAt(i))){
        		map.put(s.charAt(i), 1);
        	}else{
        		map.put(s.charAt(i), map.get(s.charAt(i))+1);
        	}
        }
        
        
        while(!map.isEmpty()){
        	int max=0;
            char maxchar=' ';
            for(Map.Entry<Character, Integer> entry:map.entrySet()){
            	if(max<=entry.getValue()){
            		max=entry.getValue();
            		maxchar=entry.getKey();
            	}
            }//得到最大值
            System.out.println(max+" "+maxchar);
            for(int i=0;i<max;i++){
            	sb.append(maxchar);
            }
            Iterator<Map.Entry<Character, Integer>> it = map.entrySet().iterator();  
            while(it.hasNext()){  
                Map.Entry<Character, Integer> entry = it.next();  
                if(entry.getKey() == maxchar)  
                    it.remove();//使用迭代器的remove()方法删除元素  
            } 
        }
        
//        System.out.println(map);
        
        
    	return sb.toString();
    }
}
