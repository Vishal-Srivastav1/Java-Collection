package it;

import java.util.concurrent.CountDownLatch;

public class DublicateString {

	
	  public static String dublicateString(String string1) {
		  int count;  
          
	        //Converts given string into character array  
	        char string[] = string1.toCharArray();  
	          
	        System.out.println("Duplicate characters in a given string: ");  
	        //Counts each character present in the string  
	        for(int i = 0; i <string.length; i++) {  
	            count = 1;  
	            for(int j = i+1; j <string.length; j++) {  
	                if(string[i] == string[j] && string[i] != ' ') {  
	                    count++;  
	                    //Set string[j] to 0 to avoid printing visited character  
	                    string[j] = '0';  
	                }  
	            }  
	            //A character is considered as duplicate if count is greater than 1  
	            if(count > 1 && string[i] != '0')  
	                System.out.println(string[i]);  
	        }
	        return string1;
	}
	
	   public static void stridublict(String s) {
		int Count;
		    char ch []= s.toCharArray();
		    
		    for (int i = 0; i <ch.length; i++) {
				 Count=1;
				 
				 for (int j = i+1; j < ch.length; j++) {
					if (ch[i]==ch[j] && ch[i]!=' ') {
						Count++;
						ch[j]='0';
					}
				}
				 if (Count> 1 && ch[i]!='0') {
					 System.out.println(ch[i]);
				}
			}
		
	}
	
	
	 public static void main(String[] args) {  
	        String string1 = "Great t "; 
	        dublicateString(string1);
	        System.out.println();
	        String s="cccvrkmtt";
	        stridublict(s);
	       }  
	     
}
