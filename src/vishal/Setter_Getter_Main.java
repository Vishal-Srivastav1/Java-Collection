package vishal;

import java.awt.Color;
import java.awt.geom.Ellipse2D;

public class Setter_Getter_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Setter_Getter_Methods s1= new Setter_Getter_Methods();
		Setter_Getter_Methods s2= new Setter_Getter_Methods();
		
		System.out.println(ConsoleColors.BLACK_BACKGROUND_BRIGHT+"S1 Values\t\t"+ConsoleColors.RESET);
		System.out.println(ConsoleColors.BANANA_YELLOW_BACKGROUND+"+=============================+");
		   s1.display();
		   System.out.println("+=============================+");
		   System.out.println();
		   System.out.println(ConsoleColors.BLACK_BACKGROUND_BRIGHT+"S2 Values\t\t"+ConsoleColors.RESET);
		   System.out.println(ConsoleColors.BANANA_YELLOW_BACKGROUND+"+=============================+");
		   s2.display();
		   System.out.println("+=============================+");
		   System.out.println();
		
	System.out.println(ConsoleColors.BLACK_BACKGROUND_BRIGHT+"S1 Values\t\t"+ConsoleColors.RESET);
	System.out.println(ConsoleColors.BANANA_YELLOW_BACKGROUND+"+=============================+"+ConsoleColors.RESET);
		System.out.print(ConsoleColors.BLUE_BACKGROUND_BRIGHT);
		  //s1.setEno(101);
		  s1.setEname("vishal");
		  s1.setSal(10000000);
		  s1.setDept("IT Componey");
		  s1.display();
		  System.out.println(s1.getEname()+" --> "+s1.getDept()+"   - "+s1.getSal() +"   _ "+s1.getClass());
		  
		  System.out.println();
		  
		  System.out.println(ConsoleColors.BLACK_BACKGROUND_BRIGHT+"S2 Values\t\t"+ConsoleColors.RESET);
			System.out.println(ConsoleColors.BANANA_YELLOW_BACKGROUND+"+=============================+"+ConsoleColors.RESET);
				System.out.print(ConsoleColors.BLUE_BACKGROUND_BRIGHT);
				//  s2.setEno(201);
				  s2.setEname("Rakesh");
				  s2.setSal(1000);
				  s2.setDept("IT Componey");
				  s2.display();
				  System.out.println();
				  System.out.println(s2.getEname()+" --> "+s2.getDept()+"   - "+s2.getSal() +"   _ "+s2.getClass());
		        s2.setSal(s2.getSal()+s2.getSal()*20/100);
		        System.out.println();System.out.println("Increased sal= "+s2.getSal());
		
		     
		   
	}

}
