package vishal;
import java.text.SimpleDateFormat;
//GenerallStore
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.InputMismatchException;
//import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

//import javax.sound.sampled.Line;


public class GeneralStore {

  
 public static void main(String[] args) {
     
			int qty1=0;                      
			int option=0;                    
			int prodId1=0,price=0;  
			int Count=0;
			String ProdName=null;               
			double totalPrice=0.0; 
			double overAllPrice = 0.0;  
	        double cgst, sgst, subtotal=0.0, discount=0.0; 
	     
			
		Scanner sc = new Scanner(System.in);
                                           
   System.out.println(ConsoleColors.YELLOW_ITALIC);
    System.out.println("--------------------------------------------------------------------");
    System.out.println("-----------------Welcome to Reliance Fresh Ameerpet-----------------");
      List<Product> product = new ArrayList<Product>();
      try {
     do {
    	//Count++;
        System.out.println("--------------------------------------------------------------------");
        System.out.println("|\t\t\t 1. Fruits\t\t\t\t " + "  |\n" + "|\t\t\t 2. Vegetables\t\t\t\t  " + " |\n"
            + "|\t\t\t 3. Dry Fruits\t\t\t\t  " + " |\n" + "|\t\t\t 4. Cosmetics\t\t\t\t   |");
        System.out.println("|\t\t\t 5. Masala Powders\t\t\t  " + " |\n" + "|\t\t\t 6. Dairy Products\t\t\t  "
            + " |\n" + "|\t\t\t 7. Snacks\t\t\t\t  " + " |\n" + "|\t\t\t 8. Exit\t\t\t\t   |");
        System.out.println("--------------------------------------------------------------------");
        
        
             // Selecting Option
        	 System.out.print("Please choose your option [1 to 8]: ");
             option = sc.nextInt();
//             if (option == 8) {
//                 System.exit(8);
//                }
		
         
        if(option==1) {
        System.out.println("--------------------------------------------------------------------");
        System.out.println("|   ProductId\t  ProductName\t   Qty\t\t   Price(per kgs)  |");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("|   101\t\t  Apple\t\t   1kg\t\t   RS-160 \t   |");
        System.out.println("|   102\t\t  Mango\t\t   1kg\t\t   RS-150 \t   |");
        System.out.println("|   103\t\t  Grapes\t   1kg\t\t   RS-70\t   |");
        System.out.println("|   104\t\t  Papaya\t   1kg\t\t   RS-60\t   |");
        System.out.println("|   105\t\t  Banana\t   1kg\t\t   RS-50\t   |");
        System.out.println("|   106\t\t  Water Melon\t   1kg\t\t   RS-20\t   |");
        System.out.println("--------------------------------------------------------------------");

        System.out.print("Please select productId: ");
         prodId1  = sc.nextInt();

        System.out.print("How many Kgs do you need: ");
        qty1 = sc.nextInt();
        System.out.println("--------------------------------------------------------------------");

        
		int prod1 = prodId1;
		if (prod1 == 101) {
			price=160;
			ProdName="Apple";
          totalPrice = qty1 * price;   
        } else if (prod1 == 102) {
        	price=150;
        	ProdName="Mango";
          totalPrice = qty1 * price;
        } else if (prod1 == 103) {
        	price=70;
        	ProdName="Grapes";
          totalPrice = qty1 * price;
        } else if (prod1 == 104) {
        	price=60;
        	ProdName="Papaya";
          totalPrice = qty1 *price;
        } else if (prod1 == 105) {
        	price=50;
        	ProdName="Banana";
          totalPrice = qty1 * price;
        } else if (prod1 == 106) {
        	price=20;
        	ProdName="Water Melon";
          totalPrice = qty1 * price;
        }
		Count++;
		//creates Product class object and add it to the List  
		 product.add(new Product(Count,prodId1,ProdName, qty1, price, totalPrice));
//       
        System.out.println("Press 1 to Continue: ");

        System.out.println("Press 8 to exit: ");
        option = sc.nextInt();
     }   
        // option = 1;
//        if (option == 8) {
//            System.exit(option);
//           }
//      
          // option = 2;
           if(option==2) {

            System.out.println("--------------------------------------------------------------------");
            System.out.println("|   ProductId\t  ProductName\t   Qty\t\t   Price(per kgs)  |");
            System.out.println("--------------------------------------------------------------------");
            System.out.println("|   201\t\t  Potato\t\t   1kg\t\t   RS-20 \t   |");
            System.out.println("|   202\t\t  Onion\t\t   1kg\t\t   RS-15 \t   |");
            System.out.println("|   203\t\t  Peas\t\t   1kg\t\t   RS-60\t   |");
            System.out.println("|   204\t\t  Cauli Flower\t1kg\t   RS-40\t   |");
            System.out.println("|   205\t\t  Cabbage\t   1kg\t\t   RS-30\t   |");
            System.out.println("|   206\t\t  Tomato\t   1kg\t\t   RS-50\t   |");
            System.out.println("--------------------------------------------------------------------");
            
            System.out.print("Please select productId: ");
             
            prodId1 = sc.nextInt();

            System.out.print("How many Kgs do you need: ");
            qty1 = sc.nextInt();
            System.out.println("--------------------------------------------------------------------");

			
			if (prodId1 == 201) {
				price=20;
				ProdName="Potato";
              totalPrice = qty1 * price;
            } else if (prodId1 == 202) {
            	price=15;
            	ProdName="Onion";
              totalPrice = qty1 * price;
            } else if (prodId1 == 203) {
            	price=60;
            	ProdName="Peas";
              totalPrice = qty1 * price;
            } else if (prodId1 == 204) {
            	price=40;
            	ProdName="CauliFlower";
              totalPrice = qty1 * price;
            } else if (prodId1 == 205) {
            	price=30;
            	ProdName="Cabbage";
              totalPrice = qty1 * price;
            } else if (prodId1 == 206) {
            	price=50;
            	ProdName="Tomato";
              totalPrice = qty1 * price;
            }
			Count++;
			//creates Product class object and add it to the List  
			 product.add(new Product(Count,prodId1,ProdName, qty1, price, totalPrice));
//	         
            System.out.println("Press 1 to Continue: ");

            System.out.println("Press 8 to exit: ");
            option = sc.nextInt();
        }
//          if (option == 8) {
//               System.exit(option);
//              }
           
           if( option==3) {

               System.out.println("--------------------------------------------------------------------");
               System.out.println("|   ProductId\t  ProductName\t   Qty\t\t   Price(per kgs)  |");
               System.out.println("--------------------------------------------------------------------");
               System.out.println("|   301\t\t  Haldi\t\t   1kg\t\t   RS-220 \t   |");
               System.out.println("|   302\t\t  jera\t\t   1kg\t\t   RS-150 \t   |");
               System.out.println("|   303\t\t  laichi\t   1kg\t\t   RS-600\t   |");
               System.out.println("|   304\t\t  long\t\t   1kg\t\t   RS-440\t   |");
               System.out.println("|   305\t\t  methi\t\t   1kg\t\t   RS-300\t   |");
               System.out.println("|   306\t\t  TejLeaf\t   1kg\t\t    RS-200\t   |");
               System.out.println("--------------------------------------------------------------------");
               
               System.out.print("Please select productId: ");
                prodId1 = sc.nextInt();

               System.out.print("How many Kgs do you need: ");
               qty1 = sc.nextInt();
               System.out.println("--------------------------------------------------------------------");

      
			
			if (prodId1 == 301) {
				price=220;
				ProdName="haldi";
                 totalPrice = qty1 * price;
               } else if (prodId1 == 302) {
            	   price=150;
            	   ProdName="jera";
                 totalPrice = qty1 * price;
               } else if (prodId1 == 303) {
            	   price=600;
            	   ProdName="laichi";
                 totalPrice = qty1 * price;
               } else if (prodId1 == 304) {
            	   price=440;
            	   ProdName="long";
                 totalPrice = qty1 * price;
               } else if (prodId1 == 305) {
            	   price=300;
            	   ProdName="methi";
                 totalPrice = qty1 * price;
               } else if (prodId1 == 306) {
            	   price=200;
            	   ProdName="TejLeaf";
                 totalPrice = qty1 * price;
               }
               Count++;
             //creates Product class object and add it to the List  
			 product.add(new Product(Count,prodId1,ProdName, qty1, price, totalPrice));
//	         
           }
          
           overAllPrice = overAllPrice + totalPrice;   
          

          
//         
     } while(option <=7 && option>=1);
     } catch (InputMismatchException se) {
    	 System.out.println();
			System.out.println(ConsoleColors.BLACK_BACKGROUND+ConsoleColors.BLACK_BOLD_BRIGHT+"Error: plz Pass Only Numeric Value"+ConsoleColors.RESET);
			System.out.println();
			System.out.println();
  	}
      System.out.println("Enter your name: ");
      String name = sc.next().toUpperCase();
      sc.nextLine();
      System.out.println("Enter your Address: ");
      String address = sc.nextLine().toUpperCase();
      System.out.println("Enter your Mobile no: ");
      long mobNo = sc.nextLong();

    
     System.out.println();
     System.out.println();
     System.out.println("\t\t\t\t"+ConsoleColors.BLACK_ITALIC+ConsoleColors.BLACK_BOLD_BRIGHT+"--------------------Invoice-----------------"+ConsoleColors.RESET);  
     System.out.println("\t\t\t\t\t "+"  "+ConsoleColors.BANANA_YELLOW_BACKGROUND+ConsoleColors.BLACK_BOLD_BRIGHT+ConsoleColors.BLACK_ITALIC+"Vishal Mart Grocery Shop");  
     System.out.println(ConsoleColors.RESET+ConsoleColors.BLACK_BOLD_BRIGHT);
     System.out.println("\t\t\t\t\t GKP (KASIA_KUSHINAGAR) UTTAR PARDESH");  
     System.out.println("\t\t\t\t\t"  +"    " +"Opposite BUDHA_TEMPLE");  
     System.out.println("GSTIN: ----"+"\t\t\t\t\t\t\t\t\t\tContact:(+91) 9305397531");  
     //format of date and time  
     SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");    
     Date date = new Date();    
     Calendar calendar = Calendar.getInstance();  
     String[] days = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };  
     //prints current date and time  
     System.out.println("Date: "+formatter.format(date)+"  "+days[calendar.get(Calendar.DAY_OF_WEEK) - 1]+"\t\t\t\t\t\t\t "+ConsoleColors.BLACK_BOLD_BRIGHT+ConsoleColors.BLACK_ITALIC+"(+91) 9305397531");  
    
       
     System.out.println();
     System.out.println("NAME: "+name + "\nAdress: " + address + "\nMobileNO: " + mobNo);
     System.out.println(ConsoleColors.RESET);
     System.out.println();
         
     System.out.println(ConsoleColors.CYAN_BACKGROUND+ConsoleColors.YELLOW_BOLD_BRIGHT);   
     Product.displayFormat();  
     for (Product p : product)   
     {  
         p.display();  
     }  
    
    
   System.out.print("|---------------------------------------------------------------------------------------------------------------|");
 //price calculation  
   System.out.print("\n|\t\t\t\t\t\t\t\t\t\tTotal Amount (Rs.) " +overAllPrice+"\t|");  
   //calculating discount  
   discount = overAllPrice*2/100;  
   System.out.print("\n|\t\t\t\t\t\t\t\t\t\t       Discount (Rs.) " +discount+"\t|");  
   //total amount after discount  
   subtotal = overAllPrice-discount;   
   System.out.print("\n|\t\t\t\t\t\t\t\t\t\t          Subtotal "+subtotal+"\t|");  
   //calculating tax  
   sgst=overAllPrice*12/100;  
   System.out.print("\n|\t\t\t\t\t\t\t\t\t\t          SGST (%) "+sgst+"\t|");
   cgst=overAllPrice*12/100;  
   System.out.print("\n|\t\t\t\t\t\t\t\t\t\t          CGST (%) "+cgst+"\t|");  
   //calculating amount to be paid by buyer  
   System.out.println("\n|\t\t\t\t\t\t\t\t\t\t     Invoice Total " +(subtotal+cgst+sgst)+"\t|");  
   System.out.println("|---------------------------------------------------------------------------------------------------------------|");
   System.out.println(ConsoleColors.RESET);
   System.out.println("\t\t\t\t"+ConsoleColors.BANANA_YELLOW_BACKGROUND+ConsoleColors.BLACK_BOLD_BRIGHT+ConsoleColors.BLACK_ITALIC+"----------------Thank You for Shopping!!-----------------"+ConsoleColors.RESET);  
   System.out.println("\t\t\t\t                    "+ConsoleColors.BLUE_ITALIC+ConsoleColors.BANANA_YELLOW_BACKGROUND+" Visit Again ");  
   System.out.println(ConsoleColors.RESET);
	
      
         
		  
      
      sc.close();
 }
}
