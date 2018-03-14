package shiti;

import java.util.Scanner;

public class Main2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int n;
		Scanner in =new Scanner(System.in);
		n=in.nextInt();
		
		
		for(int i=1;i<=n*4+5;i++){
			for(int j=1;j<=n*4+5;j++){
				if(go(i,j,n))
					System.out.print("$");
				else{
					System.out.print(".");
				}
			}
			System.out.println();
		}
		
	}
	public static boolean go(int i,int j,int n){
		//上下对称
	    if (i > n * 2 + 3)         
	        i = n * 4 + 6 - i;
	    //左右对称
	    if (j > n * 2 + 3)         
	        j = n * 4 + 6 - j;
	    //前两行时显示的为 '.'      
	    if (i <= 2 && j <= 2) return false; 
	    //每一奇数行连续的三个$     
	    if (i % 2 == 1 && j >= i - 2) return true;
	    //每一个奇数列中奇异点     
	    if (j % 2 == 1 && j != i - 1) return true;     
	    return false; 
	}

}
