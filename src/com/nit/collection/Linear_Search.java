package com.nit.collection;

public class Linear_Search {
	// linear search number 
	    private static int  search(int arr[],int x) {
	    	 for (int i = 0; i < arr.length; i++) {
				if (arr[i]== x) 
					 return i;
			}
	    	 return -1;			
		}
	
	// linear search String
	    private static int  searchName(String arr1[],String name) {
	    	 for (int j = 0; j < arr1.length; j++) {
				if (arr1[j]== name) 
					 return j;
			}
	    	 return -1;			
		}
	public static void main(String[] args) {
		  int arr[]= {1,2,3,4,5,6,7,8,5};
		  int x=5;
 		  
 		  int result=search(arr, x);
 		  if (result==-1) {
 			 System.out.println(x+" ELEMENT NOT FOUND IN ELEMENT ");
 		}else {
 		  System.out.println(x+" ELEMENT FOUND IN INDEX NO "+result);
 		}
		  
		  System.out.println("==========================================");
		  
		  String arr1[]= {"vishal","rakesh","shyam","sonu","abhay"};
		  String name="vishal";
		  
		  int result1=searchName(arr1, name);
		  if (result1 ==-1) {
			 System.out.println(name+" NAME NOT FOUND IN ELEMENT ");
		}else {
		  System.out.println(name+" NAME FOUND IN INDEX NO "+result1);
		}
	}
	
}