package com.nit.collection;

import java.util.Iterator;
import java.util.Vector;

import javax.lang.model.element.Element;

public class Vector11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Vector<Object> v1=new Vector<>();
      v1.add(1);//0
      v1.add(2);//1
      v1.add('a');
      v1.add(6);//2
      v1.add('c');//3
      v1.add(2.0f);//4
      v1.add(34.6);//5
      v1.add('d');//6
      v1.add(2.0f);//7
      v1.add(34.6);//8
      v1.add(78);//9
     // v1.add("rakesh");
      
      v1.set(1, "visal");
     
      System.out.println(v1);
      //System.out.println(v1.toString());
      System.out.println(v1.size());
      System.out.println(v1.capacity());
      System.out.println(v1.indexOf(34.6));
      System.out.println(v1.contains(78));
      int i=v1.indexOf(78);
      System.out.println(i);
     Object object= v1.get(8);
     System.out.println(object);
     System.out.println();
     for (int j = 0; j <v1.size(); j++) {
		Object bj=v1.get(j);
		System.out.println(bj);
    	
	}
     System.out.println();
     System.out.println();
     Object bj1=v1.get(9);
		System.out.println(bj1);
		v1.add(new Ex(4,6));//some Confusion because vector store hashcode Formate packname+clsName+@ like this 
		v1.add("riff");
		System.out.println();
		System.out.println();
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		System.out.println(v1.toString());
	//	Ex e=new Ex(5, 6);
	//	System.out.println(v1.indexOf(new Ex(4,6)));
		//System.out.println(v1.contains(new Ex(4,6)));
		System.out.println(v1.contains(78));
		System.out.println();
		System.out.println();
	
		//v1.forEach(System.out::println);// short lemda expression
		v1.forEach(ele-> System.out.println(ele));// lemda expression 
		System.out.println();
		System.out.println();
		
		v1.stream()
		  .filter(ele -> ele instanceof String)
		   // .forEach(System.out::println);
		  .forEach(ele-> System.out.println(ele));

	
					System.out.println();
		System.out.println();
		
		// search for max value 
		Object maxval=v1.stream()
		   .filter(ele -> ele instanceof Integer)
		   .max((e1,e2)-> (int)e1-(int)e2).get();
		      System.out.println(maxval);
		      
		      
		   // search for min value 
				Object minval=v1.stream()
				   .filter(ele -> ele instanceof Character)
				   .max((e1,e2)-> (char)e1-(char)e2).get();
				      System.out.println(minval);
				      
				      System.out.println();
				      System.out.println();

				      for (int j = 0; j <v1.size(); j++) {
				    	      Object jk= v1.get(j);
						   if (jk instanceof Character) {
							    
							    System.out.println(j+" "+jk+" char");
						}
					}				      
		      
		}
	}
      
    
	                     


