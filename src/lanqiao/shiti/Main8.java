package shiti;

import java.util.Scanner;

public class Main8 {

	/**
	 *   历届试题 买不到的数目  
	 * 数论或动态规划。
	 * @param args
	 */
	static int n1;
	static int n2;
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner in=new Scanner(System.in);
		n1=in.nextInt();
		n2=in.nextInt();
		int result=0;
		
//		for(int i=n1>n2?n1:n2;i<n1*n2;i++){
//			if(!calc2(i))
//				result=i;
//		}
//		calc3();
		System.out.println(n1*n2-n1-n2);
	}
	public static boolean calc(int n){
		if(n==0)return true;
		if(n<n1||n<n2)return false;
		if(n%n1==0||n%n2==0)return true;
		
		return calc(n-n1)||calc(n-n2);
	}
	
	public static boolean calc2(int n){
		int[][] arr=new int[1000][1000];
		for(int i=0;i<1000;i++){
			if(i!=0)arr[i][0]=arr[i-1][0]-n1;
			else arr[i][0]=n;
			if(arr[i][0]==0)return true;
			else if(arr[i][0]<0)break;
			
			for(int j=1;j<1000;j++){
				arr[i][j]=arr[i][j-1]-n2;
				if(arr[i][j]==0)return true;
				if(arr[i][j]<0)break;
			}
		}
		
		return false;
	}
	
	public static void calc3(){
		int[] d=new int[1100000];
		d[n1]=1;
		d[n2]=1;
		int result=0;
		for(int i=0;i<n1*n2;i++){
			if(n1<i)d[i]+=d[i-n1];
			if(n2<i)d[i]+=d[i-n2];
			if(d[i]<0)result=i;
		}
		System.out.println(result);
	}
}
