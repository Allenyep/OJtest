package leetcode;

import java.util.HashMap;

/**
 * 149. Max Points on a Line
 * @author Allen
 * 
 * 遍历每个点，看它和后面的每个点构成的直线上有多少个点
        对每个点建立map，斜率是key
        斜率要用分数的形式，不要用double的形式存
        计算分数时先求分子分母的最大公约数gcd，再都除以gcd
        重合的点特殊处理
 *
 */
/**
 * Definition for a point.
 * class Point {
 *     int x;
 *     int y;
 *     Point() { x = 0; y = 0; }
 *     Point(int a, int b) { x = a; y = b; }
 * }
 */
public class Main149 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public int maxPoints(Point[] points) {
    	int max=0;
    	if(points.length==0)return 0;
    	if(points.length<=2)return points.length;
    	for(int i=0;i<points.length-1;i++){
    		HashMap<String, Integer> map=new HashMap<>();//斜率 个数
            int overlap = 0;
            int lineMax = 0;
    		for(int j=i+1;j<points.length;j++){
                int x = points[i].x - points[j].x;
                int y = points[i].y - points[j].y;
                if (x == 0 && y == 0) {
                    overlap++;
                    continue;
                }
                int gcd = generateGcd(x, y);
                x /= gcd;
                y /= gcd;
                // 用string来存储斜率
                String slope = String.valueOf(x) + String.valueOf(y);
                int count = map.getOrDefault(slope, 0);
                count++;
                map.put(slope, count);
                lineMax = Math.max(lineMax, count);
                
    		}
    		max = Math.max(max, lineMax + overlap + 1);
    	}
    	
        return max;
    }
    public int generateGcd(int x, int y) {
        if (y == 0) return x;
        return generateGcd(y, x % y);
    }
    class Point {
    	      int x;
    	      int y;
    	      Point() { x = 0; y = 0; }
    	      Point(int a, int b) { x = a; y = b; }
    }

}
