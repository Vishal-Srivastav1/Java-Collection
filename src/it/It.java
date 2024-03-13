package it;

import java.security.PublicKey;
import java.util.LinkedList;
import java.util.List;

public class It {
	public static void main(String[] args) {
		List<Integer> list= new LinkedList<Integer>();
			list.add(9);
			list.add(2);
			list.add(3);
			list.add(9);
			list.add(5);
			//System.out.println(list);
			for (int i = 0; i < list.size(); i++) {
				int index=list.get(i)*2;
		          if (i==0) {
		        	  index=list.get(i);// its gives original values 9
					
				}
		          if (i==3) {
		        	  index=list.get(i);// its gives original values 9
					
				}
		         System.out.println(index); //// its prints the all the index
				
			}
			
			System.out.println();
			//finds dubilicates strings
		
			 
			  dublicate("radika");
	}
	
	public static String dublicate(String s) {
		for (int i = 0; i < s.length(); i++) {
			 char ch=s.charAt(i);
			 if (ch==0) {
				 System.out.println(ch);
			}
			 
			
		}
		
		
		return s;
	}

}
