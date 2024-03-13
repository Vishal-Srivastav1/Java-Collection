package vishal;

import java.util.Scanner;

public class DuckNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a Number ");
        n=scanner.nextInt();
        boolean isDuck=false;
        int temp=n;
        while (n!=0) {
			if(n%10==0) {
				isDuck=true;
				break;
			}
			n=n/10;
		}
        if (isDuck) System.out.println(temp+" it is a Duck Number");
        else
			System.out.println(temp+" it is not a Duck Number");
		}
       
	}


