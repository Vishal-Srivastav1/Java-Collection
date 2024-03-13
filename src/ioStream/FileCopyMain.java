package ioStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileCopyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String desfile=null,srcfile=null;
		try {
			 Scanner scanner=new Scanner(System.in);
			 System.out.print("Enter InputStrem Path");
			  srcfile=scanner.nextLine();
			 
			 System.out.print("Enter OutputStrem Path");
			  desfile =scanner.nextLine();
			 
			//FileCopy.filecopy(args[0], args[1]);
			 FileCopy.filecopy(srcfile, desfile);
			 
			scanner.close();
		} catch (ArrayIndexOutOfBoundsException a) {
			System.out.println("Please pass Source or Destionation File");
			System.out.println("Please pass like java test.txt vk.txt");
		}catch (FileNotFoundException f) {
					//System.out.println("Error: The given File-> "+args[0]+" Or "+args[1]+" <-Source Not  found  ");
					System.out.println("Error: The given File-> "+srcfile+" Or "+desfile+" <-Source Not  found  ");
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
