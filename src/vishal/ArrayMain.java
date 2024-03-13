package vishal;

public class ArrayMain {

	// Elements of the array are objects of a class Student.
	    public static void main(String[] args)
	    {
	        // declares an Array of integers.
	    	Array[] arr;
	 
	        // allocating memory for 5 objects of type Student.
	        arr = new Array[5];
	 
	        // initialize the first elements of the array
	        arr[0] = new Array(1, "aman");
	 
	        // initialize the second elements of the array
	        arr[1] = new Array(2, "vaibhav");
	 
	        // so on...
	        arr[2] = new Array(3, "shikar");
	        arr[3] = new Array(4, "dharmesh");
	        arr[4] = new Array(5, "mohit");
	 
	        // accessing the elements of the specified array
	        for (int i = 0; i < arr.length; i++)
	            System.out.println("Element at " + i + " : " + arr[i].roll_no + " "+ arr[i].name);
	    }
	}



