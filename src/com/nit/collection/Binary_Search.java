package com.nit.collection;



public class Binary_Search {

	//Binary_search
	    public static int search(int arr[], int l,int r,int x) {
	    	if (r>=l) {
	    		int mid=l+(r-l)/2;
			
	    		if (arr[mid]==x) 
	    			return mid;
	    		if (arr[mid]>x) {
					return search(arr, l, mid-1, x);
				}
	    		 return search(arr, mid+1, r, x);
			}
	    	    return -1;
	    }
	    	
	    	public static void main(String[] args) {
				  int arr[]= {10,20,30,40,50,60,70,80,100,90};
				  int x=90;
				  int r=arr.length;
				 int result=search(arr, 0, r-1, x);
				  if (result==-1) {
					System.out.println(x+" Element Not found In Array ");
				}else {
					System.out.println(x+" Element found In Array "+result);
				}
			}
	    	
	  
	
}
