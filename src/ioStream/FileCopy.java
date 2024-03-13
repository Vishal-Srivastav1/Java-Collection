package ioStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

   public static void filecopy(String srcfile, String desfile) throws FileNotFoundException,IOException {
	   FileInputStream fi = new FileInputStream(srcfile);
	   FileOutputStream fo = new FileOutputStream(desfile);
	   
	   int i;
	   while ((i=fi.read())!=-1) {
		fo.write(i);
	}
	   System.out.println("Data has wrriten/Copied to "+desfile+" file..");
	   
	   fi.close();
	   fo.close();
   }
   
}
