package lanqiao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main9_2 {
	
	static class City{
		int pi,qi,di;
		City next;
		
		public City(){
			
		}
		
		public City(int pi,int qi,int di){
			this.pi=pi;
			this.qi=qi;
			this.di=di;
		}	
	}
	
	static City[] city;
	static boolean[] isVisited;
	
	static int max=0;
	static int DFS(City c){
		int max1=0,max2=0;
		
		while(c!=null){
			isVisited[c.pi]=true;
			if(!isVisited[c.qi]){
				int di=DFS(city[c.qi].next)+c.di;
				if(di>max2){
					max2=di;
					if(max2>max1){
						 max1 = max1 ^ max2;  
	                      max2 = max1 ^ max2;  
	                      max1 = max1 ^ max2;
					}
				}
				if(max<max1+max2){
					max=max1+max2;
				}
			}
			c=c.next;
		}
		return max1;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		 int n = Integer.parseInt(br.readLine());  
		 
		 city = new City[n + 1];  
	     isVisited = new boolean[n + 1];  
	     for (int i = 1; i < city.length; i++)  
	         city[i] = new City();
	     
	     
	     for (int i = 0; i < n - 1; i++) {  
	            String data[] = br.readLine().split(" ");  
	            int pi = Integer.parseInt(data[0]);  
	            int qi = Integer.parseInt(data[1]);  
	            int di = Integer.parseInt(data[2]);  
	  
	            City co = city[pi];  
	            while (co.next != null)  
	                co = co.next;  
	            co.next = new City(pi, qi, di);  
	  
	            City ct = city[qi];  
	            while (ct.next != null)  
	                ct = ct.next;  
	            ct.next = new City(qi, pi, di);  
	        }  
	  
	        DFS(city[1].next);  
	        System.out.println((21 + max) * max / 2);  
	}
}
