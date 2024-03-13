package com.nit.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

import vishal.ConsoleColors;
/*
 * 1_-->when we need to compare int or Double data we have getXXX method like
 *  fro int,double we need to define variable like 'double' "int index=" nd store refrence what we taken 
 * (s1,s2) with GetXXX method using with some logic like s1.getRoll_no-s2.getRoll_no
 * 
 * TreeSet<Student> tr2=new TreeSet<>(                        // for int , double we need to access getXXX method and some condition  
				                   (st1,st2) ->{ 
		                               Double diffntfee= st2.getFees()-st1.getFees() ;    // we take int or double based on getData types
		                                                             
		                                if (diffntfee<0) {         	        // if (diffntfee>0) {  its gives Ascending Order
											return -1;                      //     return -1;      
										}                                   //     }               
		                                else {                                                     
											return +1;
										}
		});
		
 * 
 * 2_--> when we need to compare to String then we have CompareTo method like
 *         TreeSet<Student> tr1=new TreeSet<>((st1,st2) -> st2.compareTo(st1) );
 * 
 * 
 *                                   For ArrayList 
 *                                   1. for Ascending we have method called  "Collections.sort(al1);"
 *                                   2. for descending we  have lamda Expression like Collections.sort(al1,(stt1,stt2)-> stt2.compareTo(stt1)
 *                                   */

///Develop a project to sorting student objects in sorting order by using tree_set
//1. sort all student Objects based on the course and Roll_no in Ascending Order  (Course then Roll_no)
//2. sort all student Objects based on the course and Roll_no in Descending Order  (Course then Roll_no)
//3. sort all student Objects based on the fees there  in Ascending Order  (fees)
//3. sort all student Objects based on the roll_no there  in Descending Order  (Roll_no)
//2.
//3.
//4.
public class Student_Main {

	public static void main(String[] args) {
		
		Student s1= new Student(1001, "Vikash", "Selenium", 7000.0);
		Student s2= new Student(1001, "vishal", "java", 2500.0);
		Student s3= new Student(1002, "Amit", "HTML", 2500.0);
		Student s4= new Student(1003, "rakesh", "Python", 2000.0);
		Student s5= new Student(1002, "vishal", "java", 2500.0);
		Student s6= new Student(1001, "vishal", "Selenium", 7000.0);
		Student s7= new Student(1003, "syam", "java", 2500.0);
		Student s8= new Student(1004, "rahul", "HTML", 2500.0);
		Student s9= new Student(1005, "vidya", "Python", 2000.0);
		
		TreeSet<Student> tr=new TreeSet<>();
		// sort all student Objects based on the course and Roll_no in Ascending Order  (Course then Roll_no)
		tr.add(s1);//  
		//System.out.println(tr);
		tr.add(s2);//s2.compareto(s1) -->  +1
		tr.add(s3);//s3.compareto(s2)-->   +1
		tr.add(s4);// s4.compareto(s3)-->
		tr.add(s5);
		tr.add(s6);
		tr.add(s7);
		tr.add(s8);
		tr.add(s9);
		
		System.out.println();
		System.out.println(ConsoleColors.BANANA_YELLOW_BACKGROUND+ConsoleColors.CYAN_BOLD+" 1. all student Objects based on the course and Roll_no in Ascending Order  (Course then Roll_no) "+ConsoleColors.RESET);
		System.out.println(tr);
		System.out.println();
		System.out.println();
		
		TreeSet<Student> tr1=new TreeSet<>((st1,st2) -> st2.compareTo(st1) );// for string we have "CompareTo" method
		// sort all student Objects based on the course and Roll_no in Descending Order  (Course then Roll_no)
		tr.add(s1);//  
		//System.out.println(tr);
		tr1.add(s2);//s2.compareto(s1) -->  +1
		tr1.add(s3);//s3.compareto(s2)-->   +1
		tr1.add(s4);// s4.compareto(s3)-->
		tr1.add(s5);
		tr1.add(s6);
		tr1.add(s7);
		tr1.add(s8);
		tr1.add(s9);
		System.out.println(ConsoleColors.BANANA_YELLOW_BACKGROUND+ConsoleColors.CYAN_BOLD+" 2. All student Objects based on the course and Roll_no in Descending Order  (Course then Roll_no) "+ConsoleColors.RESET);
		System.out.println(tr1);
		System.out.println();
		System.out.println();
		
		TreeSet<Student> tr2=new TreeSet<>(// for int , double we need to access getXXX method and some condition  
				                   (st1,st2) ->{ 
		                               Double diffntfee= st2.getFees()-st1.getFees() ;
		                                                             
		                                if (diffntfee<0) {         	        // if (diffntfee>0) {  its gives Ascending Order
											return -1;                      //     return -1;      
										}                                   //     }               
		                                else {                                                     
											return +1;
										}
		});
		// sort all student Objects based on the fees in Descending Order  (fees)
		tr.add(s1);//  
		//System.out.println(tr);
		tr2.add(s2);//s2.compareto(s1) -->  +1
		tr2.add(s3);//s3.compareto(s2)-->   +1
		tr2.add(s4);// s4.compareto(s3)-->
		tr2.add(s5);
		tr2.add(s6);
		tr2.add(s7);
		tr2.add(s8);
		tr2.add(s9);
		System.out.println(ConsoleColors.BANANA_YELLOW_BACKGROUND+ConsoleColors.CYAN_BOLD+" 3. sort all student Objects based on the fees in Descending Order  (fees) "+ConsoleColors.RESET);
		System.out.println(tr2);
		System.out.println();
		System.out.println();
		
		TreeSet<Student> tr3=new TreeSet<>(
				(st1,st2) ->{ 
					int diffntfee= st2.getRoll_no()-st1.getRoll_no() ;
					
					if (diffntfee<0) {         	        // if (diffntfee>0) {  its gives Ascending Order
						return -1;                      //     return -1;      
					}                                   //     }               
					else {                                                     
						return +1;
					}
				});
		// sort all student Objects based on the fees in Descending Order  (fees)
		tr.add(s1);//  
		//System.out.println(tr);
		tr3.add(s2);//s2.compareto(s1) -->  +1
		tr3.add(s3);//s3.compareto(s2)-->   +1
		tr3.add(s4);// s4.compareto(s3)-->
		tr3.add(s5);
		tr3.add(s6);
		tr3.add(s7);
		tr3.add(s8);
		tr3.add(s9);
		System.out.println(ConsoleColors.BANANA_YELLOW_BACKGROUND+ConsoleColors.CYAN_BOLD+" 4. sort all student Objects based on the roll_no there  in Descending Order "+ConsoleColors.RESET);
		System.out.println(tr3);
		
		System.out.println();
		System.out.println();
		System.out.println();
    ArrayList<String> al1= new ArrayList<>();	
    al1.add("a");
    al1.add("c");
    al1.add("e");
    al1.add("d");
    al1.add("b");
    al1.add("g");
    al1.add("f");
    System.out.println(ConsoleColors.BANANA_YELLOW_BACKGROUND+ConsoleColors.CYAN_BOLD+"ArrayList Obj"+ConsoleColors.RESET);
    System.out.println(al1);
    System.out.println(ConsoleColors.BANANA_YELLOW_BACKGROUND+ConsoleColors.CYAN_BOLD+"Array list Ascending Order using predefine class method"+ConsoleColors.RESET);
    Collections.sort(al1);
    System.out.println(al1);
    System.out.println(ConsoleColors.BANANA_YELLOW_BACKGROUND+ConsoleColors.CYAN_BOLD+"ArrayList Descending Order usng predefined class method bt using lemda Expression "+ConsoleColors.RESET);
   // Collections.sort(al1, (stt1,stt2)-> stt2.compareTo(stt1));
    System.out.println(al1);
		
		
       
	}

}
