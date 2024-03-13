package vishal;

import java.util.Scanner;

public class HappyNumber {

	public static int  getNext(int n) {
		int totalSum=0;
		while (n>0) {
			int d=n%10;
			n=n/10;
			totalSum +=d*d;
		}
		return totalSum;
	}
	
	public static boolean isHappy(int n) {
		int slowRunner=n;
		int fastRuner=getNext(n);
		while (fastRuner!=1 && slowRunner !=fastRuner) {
			slowRunner =getNext(slowRunner);
			fastRuner=getNext(getNext(fastRuner));
			
		}
		return fastRuner==1;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc =new Scanner(System.in);
     System.out.println("Enter Happy NUmber ");
     int n=sc.nextInt();
     boolean ans=isHappy(n);
     System.out.println(ans);
	}

}
