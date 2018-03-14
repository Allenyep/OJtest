package shiti;

import java.util.Scanner;

//  历届试题 带分数  
//  DFS深度优先遍历
//  http://blog.csdn.net/acmman/article/details/19282173
public class Main3 {

	/**
	 * @param args
	 */
	static int aws=0;
	static int a[]=new int[10],flag[]=new int[10];
	static int sum(int start,int end){
		int i,sum=0;    
	    for(i=start;i<end;i++)   
	    	sum=sum*10+a[i+1];    
	    return sum;
	}
	
	static void Found(int a[],int n,int m){
		int i,j,begin=0;
		for(i=1;i<n;i++){
			int m1=sum(0,i);
			if(m1>m)return;
			for(j=i+(n-i)/2;j<n-1;j++){
				int m2=sum(i,j);
				int m3=sum(j,n-1);
				if(m2>m3&&m2%m3==0&&m==m1+m2/m3){  
		            aws++;  
		        }  
			}
		}
	}
	
	static void DFS(int start,int n,int m){
		 int i;  
	     if(start==n)  
	     Found(a,n,m);  
	     else  
	     {  
	         for(i=1;i<n;i++)  
	         {  
	            if(flag[i]>0)   
	            continue;    
	            a[start]=i;    
	            flag[i]=1;    
	            DFS(start+1,n,m);//选择好一位开始选下一位   
	            flag[i]=0;  
	         }  
	     }  
	}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int i,j,m;  
	    double s1,s2; 
	    for(i=0;i<flag.length;i++){
	    	flag[i]=0;
	    }
	    Scanner in=new Scanner(System.in);
	    m=in.nextInt();
	    DFS(1,10,m); 
	    System.out.println(aws);
	}

}
