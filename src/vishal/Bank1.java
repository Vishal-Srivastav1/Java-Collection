package vishal;

public class Bank1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Bank b1= new Bank();
      System.out.println( b1.isActive());
    
     if (b1.isActive()) {
		System.out.println("Active");
	}else {
		System.out.println("Not- Active");
	}
    // System.out.println( b1.isActive());
    
        b1.setActive(true);
        //System.out.println( b1.isActive());
        System.out.println(b1.isActive()?"active":"!active");
	}

}
