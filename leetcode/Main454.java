package leetcode;

import java.util.HashMap;

/**
 * 454. 4Sum II
 * @author Allen
 *
 */
public class Main454 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int res=0;
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<C.length;i++)
        	for(int j=0;j<D.length;j++)
        		map.put(C[i]+D[j], map.getOrDefault(C[i]+D[j], 0)+1);
        
        for(int i=0;i<A.length;i++){
        	for(int j=0;j<B.length;j++){
        		if(map.containsKey(0-A[i]-B[j]))
        			res+=map.get(0-A[i]-B[j]);
        	}
        }
    	return res;
    }
}
