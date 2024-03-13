package vishal;

public class AO {
	static int add(int a,int b) {
		return a+b;		
	}
	
	static int sub(int a,int b) {
		return a-b;		
	}
	
	static int mul(int a,int b) {
		return a*b;		
	}
	
	static int div(int a,int b) {
		return a/b;		
	}
	
	static int rem(int a,int b) {
		return a%b;		
	}
	
	static void maxmin(int a, int b) {
		 if(a<0 || b<0) {
			System.out.println("Dont pass - negative value"); 	
		}else if(a>b || b<a) {
			System.out.println("Value is Maximum  " + a); 
			System.out.println("Value is Minimum  " + b);
		}else if(b>a || a<b){
			System.out.println("Value is Maximum  " + b); 
			System.out.println("Value is Minimum  " + a);
		}else if(a==b) {
			System.out.println("Value is " + a +" "+ b + "  equal");
		}else if(a<=0 && b<=0) {
			System.out.println("Dont pass - negative value"); 	
		}else {
			System.out.println("TRY......again  DEAR..........!");
		}
	}
	
	static void evenodd(int a, int b) {
		 if(a % 2 == 0 && b % 2 == 0 ) {
			System.out.println("Both Number is Even  "+ a +" "+ b);
		 }else if(a % 2 != 0 && b % 2 != 0 ) {
			System.out.println("Both Number is Odd   "+ a +" "+ b);
		}else if(a % 2 == 0 || b % 2 != 0 ) {
			System.out.println("Number is Even  " + a);
			System.out.println("Number is odd   " + b);	
		}else if(b % 2 == 0 || a % 2 != 0 ) {
			System.out.println("Number is Even  " + b);
			System.out.println("Number is odd   " + a);	
		}
		
	}
	

}
