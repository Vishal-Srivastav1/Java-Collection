package vishal;

public class First_Letter_UpperCaseof_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	 	String str=" greeks for greeks ";
		 char[] ch = str.toCharArray();
		 
	
		  
     for (int i = 0; i < str.length()-1; i++) {
		//if (i==0 && ch[i]!=' ' || ch[i]!=' ' && ch[i-1]==' ' || ch[i+1]==' ' ){     // its give first and last capital                                 
			if (i==0 && ch[i]!=' ' || ch[i]!=' ' && ch[i-1]==' ') {    //its gives only first latter capital
    	 if (ch[i]>='a' && ch[i]<='z') {
				     ch[i] = (char)(ch[i]-'a'+'A');
				     
			}
		}
	}
     
     for (int i = 0; i < ch.length; i++) {
    	System.out.print(ch[i]);
    }
     
	}
}




