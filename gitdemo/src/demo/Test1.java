package demo;

import java.util.HashMap;

public class Test1 {
	public static void main(String[] args) {
		
		String s = "shri swami samarth jay jay swami samarth";
		
		       String [] splitv =  s.split(" ");
		
		          HashMap<String,Integer>hm = new HashMap<String,Integer>();
		
		
		         for(String ss:splitv)
		         {
		        	 if(hm.containsKey(ss))
		        	 {
		        		 hm.put(ss, hm.get(ss)+1);
		        	 }
		        	 else {
		        		 hm.put(ss, 1);
		        	 }
		         }
		
		
		System.out.println(hm);
		
		
		
		
	}

}
