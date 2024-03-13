package com.nit.collection;
/// pojo class 

import java.util.Objects;

public class Student implements Comparable<Student>{
      private int roll_no;
      private String nameString;
      private String couString;
      private double fees;
      
        
	  public Student(int roll_no, String nameString, String couString, double balance) {
		this.roll_no = roll_no;
		this.nameString = nameString;
		this.couString = couString;
		this.fees = balance;
	}
	
   
	public int getRoll_no() {
		return roll_no;
	}

    public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public String getCouString() {
		return couString;
	}

    public void setCouString(String couString) {
		this.couString = couString;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

		

	 
	    @Override
	public int hashCode() {
		return Objects.hash(couString, fees, nameString, roll_no);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Student)) {
			return false;
		}
		Student other = (Student) obj;
		return Objects.equals(couString, other.couString)
				&& Double.doubleToLongBits(fees) == Double.doubleToLongBits(other.fees)
				&& Objects.equals(nameString, other.nameString) && roll_no == other.roll_no;
	}



	         @Override
            public int compareTo(Student o) {
            	//compare student object by using Course 
            	int coursediff= this.couString.compareTo(o.couString);
            	
            	if (coursediff==0) {
            		//if they belongs to same course compare student object by using roll_no;
            		return this.roll_no - o.roll_no;
	        		
	        	}
            	return coursediff;
            }
//   
//		@Override
//		public int compareTo(Student o) {
//			// comparing student object by using name 
//	    int diffnamae=this.nameString.compareTo(o.nameString);
//	    
//	         if (diffnamae==0) {
//	        	 // if they belongs to same name compare student object by using roll_no; 
//				return this.roll_no-o.roll_no;
//			}
//			return diffnamae;
//		}
      
                                                                                                                                                    
		@Override
		public String toString() {
			return "\nStudent [roll_no=" + roll_no + ", nameString=" + nameString + ", couString=" + couString + ", fees="
					+ fees + "]";
		}
	
	    
	
     
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
}
