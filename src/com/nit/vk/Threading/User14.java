package com.nit.vk.Threading;

public class User14 extends Thread{ 

         public void run(){  
          for(int i=1;i<=4;i++){  
           try{  
            Thread.sleep(500);  
           }catch(Exception e){System.out.println(e);}  
          System.out.println(getName()+" "+i);
          
          }  
         }  
        public static void main(String args[]){  
            User14 th1=new User14 ();  
            User14 th2=new User14 ();  
            User14 th3=new User14 ();  
            
         
         th1.start(); 
        // System.out.println();
       try{  
          th1.join();  
         }
         catch(Exception e){
             System.out.println(e);
             }  
//           
         th2.start();    
         th3.start(); 
     
       }  
     } 

