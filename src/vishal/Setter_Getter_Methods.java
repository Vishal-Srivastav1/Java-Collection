package vishal;

import java.awt.DisplayMode;

public class Setter_Getter_Methods {
	static long accNumSeq=978789;
	private long eno;
    private String ename;
    private String dept;
    private double sal;
     // Setter and getter methods 
    
//     public void setEno(int eno) {
//		this.eno = eno;
//	}
    {
    	eno=++accNumSeq;
//    	System.out.println(eno);
    }
//	 public int getEno() {
//			return eno;
//		}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEname() {
		return ename;
	}
	
     
     public void setDept(String dept) {
		this.dept = dept;
	} 
     public String getDept() {
		return dept;
	}
     
     
     public void setSal(double sal) {
		this.sal = sal;
	}
     public double getSal() {
		return sal;
	}
     
     void display() {
    	 System.out.println("Eno= "+eno);
    	 System.out.println("Ename= "+ename);
    	 System.out.println("Dept= "+dept);
    	 System.out.println("Sal= "+sal);
     }
     
     
     
     
     
     
     
}

