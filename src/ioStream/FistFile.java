package ioStream;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import vishal.ConsoleColors;

public class FistFile {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		
		 FileOutputStream fos= new FileOutputStream("C:\\Users\\Acer\\Desktop\\dog3.txt");///if we put true it repeat and data coutinously..
		                                                                                       //or remove if will print once you execute multiple time it will      
		                                                                                        //so the sem data if we have'nt added
		   FileInputStream fis = new FileInputStream("C:\\Users\\Acer\\Desktop\\dog2.txt");
		   
		   
		   
		   
		   
		   
		    System.out.println(ConsoleColors.BANANA_YELLOW_BACKGROUND+"OUTPUTSTREAM"+ConsoleColors.RESET);
//		     fos.write('v');	// if we copy data this writendata (thisData+ previous) All are copied 	     
//		     fos.write('i');
//		     fos.write('s');
//		     fos.write('h');
//		     fos.write('a');
//		     fos.write('l');
//		     fos.write(99);
//		     fos.write('f');
//		     
//		     fos.write('k');
		    
		  System.out.println("Your text is added to the file Succesfully");
		
//		  if (fos!=null) {
//				fos.close();
//			}
//		
		
		
	System.out.println();	
	System.out.println();	
	System.out.println();	
	System.out.println();	
	
	
	
	
	System.out.println(ConsoleColors.BANANA_YELLOW_BACKGROUND+"INPUT STREAM"+ConsoleColors.RESET);	
		// TODO Auto-generated method stub
   
    int i;
    while ((i=fis.read())!=-1) 
    {
	   //System.out.println(i+" ");	//123456789   its print all every things 
	   System.out.print((char)i);
	   
	   fos.write(i);// here we copy the data one file to another file 
	   
	}
    System.out.println("\nData is Copied Succefully");
          fis.close();
          fos.close();
//       if (fis!=null) {
//		fis.close();
//	}
    
    
    
    
        // int i;
         
   
//       do {
//    	   int i;
//    	   i=fis.read();
//		   
//    	     // System.out.println(i);      // its print but one line left one line
//			System.out.print((char)i);      //13579
//			//System.out.print(" ");
//		} while ((fis.read() !=-1));
//            
      
	}

}
