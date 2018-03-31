package leetcode;

import java.util.HashMap;

/**
 * 149. Max Points on a Line
 * @author Allen
 * 
 * ����ÿ���㣬�����ͺ����ÿ���㹹�ɵ�ֱ�����ж��ٸ���
        ��ÿ���㽨��map��б����key
        б��Ҫ�÷�������ʽ����Ҫ��double����ʽ��
        �������ʱ������ӷ�ĸ�����Լ��gcd���ٶ�����gcd
        �غϵĵ����⴦��
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
    		HashMap<String, Integer> map=new HashMap<>();//б�� ����
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
                // ��string���洢б��
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
