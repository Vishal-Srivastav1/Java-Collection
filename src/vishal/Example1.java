package vishal;



public class Example1 extends Example{
	
	 int y=m3();
	  // static int y= 40;
	   
	   int m3() {
		   System.out.println("Sa Nsv");
		   return 20;
	   }
	   
	 // static
	  {
		   System.out.println("Sa NsB");
		   System.out.println("y= "+y);
		   System.out.println("x= "+x);
		   System.out.println("y= "+getY());
	   }
	  
//	  {
//		  System.out.println("Sa NsB");  
//	  }
//	  
//	  
	  public  int getY() {
		return y;
	}
	   
	    public Example1() {
		super();
		System.out.println("Sa NpC");
	}
	   
	   void m4() {
		   System.out.println("Sa Nsm");
	   }

	public static void main(String[] args) {
	Example1 s1=new Example1();
//	 System.out.println(s1.y);
//	 System.out.println(s1.x);
	}

}                      //   Ex Nsv
//Ex Nsv               //   Ex NsB
//Ex NsB               //   x= 10
//Ex NpC               //   Ex NsB End
//Sa Nsv               //   Ex NpC
//Sa NsB               //   Sa Nsv
//Sa NpC               //   Sa NsB
//20                   //   y= 20
//10                   //   x= 10
                       //   y= 20
                       //   Sa NpC
                       //   