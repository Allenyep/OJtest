package leetcode;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * 202. Happy Number
 * @author Allen
 *
 */

public class Main202 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isHappy(3));
	}
    public static boolean isHappy(int n) {
    	if(n==1)return true;
    	if(n<=0)return false;
    	
    	
        ArrayList<Integer> list=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        
        while(n!=1){
        	set.add(n);
        	while(n!=0){
            	list.add(n%10);
            	n=n/10;
            }
            for(int i:list){
            	n+=i*i;
            }
            
            list.removeAll(list);
            if(set.contains(n)){
            	return false;
            }
        }
        
        
    	
    	return true;
    }

}
