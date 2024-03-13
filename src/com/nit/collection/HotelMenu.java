package com.nit.collection;

import java.util.Iterator;

public class HotelMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.println(TiffinItem.IDLY);
   System.out.println(TiffinItem.BAJHI);
   System.out.println(TiffinItem.DOSA);
   System.out.println(TiffinItem.PURI);
   System.out.println(TiffinItem.VADAPAW);
  // System.out.println(TiffinItem.IDLY);
   System.out.println();
   System.out.println();
   System.out.println();
  
   TiffinItem [] tiffinItems = TiffinItem.values();
   for (int i = 0; i < tiffinItems.length; i++) {
	   System.out.print("\n "+(tiffinItems[i].ordinal()+1)+".");
	   System.out.print(" "+tiffinItems[i].name());
	   System.out.print(" "+tiffinItems[i].price());
	   
	   
}
   
   
   
	}

}
