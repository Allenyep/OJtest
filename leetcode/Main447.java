package leetcode;

import java.util.HashMap;

public class Main447 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a=(100+1.0/3)-100;
		double b=1.0/3;
//		System.out.println("a:"+a);
//		System.out.println("b:"+b);
		int[][] points={{0,0},{1,0},{2,0}};
		System.out.println(numberOfBoomerangs(points));
	}
    public static int numberOfBoomerangs(int[][] points) {
    	int res=0;
    	for(int i=0;i<points.length;i++){
    		HashMap<Integer, Integer> map=new HashMap<>();
    		for(int j=0;j<points.length;j++){
    			if(i!=j){
    				int len=(points[i][0]-points[j][0])*(points[i][0]-points[j][0])+
    						(points[i][1]-points[j][1])*(points[i][1]-points[j][1]);
//    				System.out.println(len);
    				map.put(len,map.getOrDefault(len, 0)+1);
    			}
    		}
//    		System.out.println(map);
    		for(int k:map.values()){
    				res+=k*(k-1);
    		}
    	}
    	
    	
    	
    	
    	return res;
    }
    
    

}
