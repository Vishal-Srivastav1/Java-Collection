package vishal;




public class VariableHeddindMain extends VariableHidding {
	int x=20;
	static int y=20;
	public static void main(String[] args) {
		VariableHeddindMain b1=new VariableHeddindMain();
		
		m1();
		b1.m2();
		//a1.m2();
		m3();
		b1.m4();
	}
	static void m1(){
	//	System.out.println(x);
		System.out.println(y);
		System.out.println("MAin class");
		VariableHeddindMain b1=new VariableHeddindMain();
		System.out.println(b1.x);
		System.out.println(b1.y);
		System.out.println();
		System.out.println("Super class");
		VariableHidding a1=new VariableHidding();
		System.out.println(a1.x);
		System.out.println(a1.y);
		System.out.println();
		System.out.println();
	}
	void m2() {
		System.out.println("super"+super.x);
		System.out.println("super"+super.y);
		System.out.println();
		System.out.println("this"+this.x);
		System.out.println("this"+y);
	}
	
	static void m3() {
		VariableHeddindMain b1=new VariableHeddindMain();
		VariableHidding a1=b1;
		System.out.println();
		System.out.println("Static M3");
		System.out.println("b1.x= "+b1.x);
		System.out.println("a1.x= "+a1.x);
	}
	
	void m4() {
		VariableHeddindMain b1=new VariableHeddindMain();
		VariableHidding a1=b1;
		System.out.println();
		System.out.println("non-Static M4");
		System.out.println("b1.x= "+b1.x);
		System.out.println("a1.x= "+a1.x);
	}
	
}
