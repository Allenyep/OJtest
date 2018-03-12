package lanqiao;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *  历届试题 横向打印二叉树  
 *  二叉排序树
 * @author Allen
 *
 */
public class Main11 {
	static int root;
	public static BinTree[] tree = new BinTree[10005];
	
	public static class BinTree{
		int value;
		int father;
		int left;
		int right;
		
		public BinTree() {
			// TODO Auto-generated constructor stub
			value=0;
			father=0;
			left=0;
			right=0;
		}
		
		public BinTree(int val) {
			// TODO Auto-generated constructor stub
			value=val;
		}
		
	}
	
	 public static void dfs(int start, String s, int n, String s1) {
	        if(tree[start].value == root)
	            s = s + tree[start].value;
	        else {
	            s = s + "-|-";
	            s = s + tree[start].value;
	        }
	        if(tree[start].right > 0) {
	            s1 = s1 + "1";
	            dfs(tree[start].right, s, n + 1, s1);
	            s1 = s1.substring(0, s1.length() - 1);
	        }
	        int len = s.length();
	        int cot = 0;
	        for(int i = 0;i < len;i++) {
	            if(s.charAt(i) == '|') {
	                if(s1.length() <= cot + 1 || s1.charAt(cot) != s1.charAt(cot + 1))
	                    System.out.print("|");
	                else
	                    System.out.print(".");
	                cot++;
	            } else if(cot < n) {
	                System.out.print(".");
	            } else {
	                System.out.print(s.charAt(i));
	            }
	        }
	        if(tree[start].left > 0 || tree[start].right > 0)
	            System.out.print("-|");
	        System.out.println();
	        if(tree[start].left > 0) {
	            s1 = s1 + "0";
	            dfs(tree[start].left, s, n + 1, s1);
	            s1 = s1.substring(0, s1.length() - 1);
	        }
	    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		String str=in.nextLine();
		String[] strs=str.split(" ");
		int[] arr=new int[strs.length];
		for(int i=0;i<strs.length;i++){
			arr[i]=Integer.valueOf(strs[i]);
		}
		root=arr[0];
		for(int i=0;i<tree.length;i++){
			tree[i]=new BinTree();
		}
		
		//值放入对象中
		for(int i = 0;i < arr.length;i++) {
            int a = arr[i];
            tree[a].value = a;
        }
		
		//数组遍历
		for(int i = 1;i < arr.length;i++) {
			int a=arr[i];
			int temp=root;
			//二叉排序树插入
			while(true) {
                if(a > temp) {
                    if(tree[temp].right == 0) {
                        tree[temp].right = a;
                        break;
                    } else
                        temp = tree[temp].right;
                }
                else {
                    if(tree[temp].left == 0) {
                        tree[temp].left = a;
                        break;
                    } else 
                        temp = tree[temp].left;
                }
            }
		}
		String s = "";
        String s1 = "";
        dfs(root, s, 0, s1);
	}
}
