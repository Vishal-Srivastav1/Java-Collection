package vishal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//Reading file at desktop;

public class TestFile {

	public static void main(String[] args)throws FileNotFoundException,InterruptedException {
		// TODO Auto-generated method stub
		File file=new File("C:\\Users\\Acer\\Desktop\\dog.txt");
		Scanner reader=new Scanner(file);
		while(reader.hasNextLine()) {
			String line=reader.nextLine();
			//System.out.println(ConsoleColors.CYAN_BACKGROUND+ConsoleColors.RESET);
			System.out.println(ConsoleColors.DARK_BLUE+line);

			//System.out.println(line);
			Thread.sleep(100);
		}
			
		}

	}


