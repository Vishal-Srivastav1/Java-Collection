package com.nit.collection;

import java.util.EnumSet;
import java.util.Set;

public class Test_EnumSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EnumSet<TiffinItem> tiffinItemsSet1 = EnumSet.of(TiffinItem.IDLY);
		EnumSet<TiffinItem> tiffinItemsSet2 = EnumSet.of(TiffinItem.IDLY,TiffinItem.DOSA);
		EnumSet<TiffinItem> tiffinItemsSet3 = EnumSet.of(TiffinItem.IDLY,TiffinItem.DOSA,TiffinItem.BAJHI);
		EnumSet<TiffinItem> tiffinItemsSet4 = EnumSet.of(TiffinItem.IDLY,TiffinItem.DOSA,TiffinItem.PURI,TiffinItem.VADAPAW);                           
		
		EnumSet<TiffinItem> tiffinItemsSet5= EnumSet.allOf(TiffinItem.class);//its gives all items
		
		EnumSet<TiffinItem> tiffinItemsSet6=EnumSet.copyOf(tiffinItemsSet2);// its cops the tiffinItemsSet2 element Obj
		
		EnumSet<TiffinItem> tiffinItemsSet7=EnumSet.complementOf(tiffinItemsSet4);//it gives Only that items what isn't in tiffinItemsSet4..
		
		EnumSet<TiffinItem> tiffinItemsSet8= EnumSet.noneOf(TiffinItem.class);
		
		System.out.println("Set1 "+tiffinItemsSet1);
		System.out.println("Set2 "+tiffinItemsSet2);
		System.out.println("Set3 "+tiffinItemsSet3);
		System.out.println("Set4 "+tiffinItemsSet4);
		System.out.println();
		System.out.println();
		System.out.println("Set5 "+tiffinItemsSet5);
		System.out.println("Set6_set2 ref "+tiffinItemsSet6);
		System.out.println("Set7 -set4 ref "+tiffinItemsSet7);
		System.out.println("Set8 "+tiffinItemsSet8);
		System.out.println();
		System.out.println();
		tiffinItemsSet1.add(TiffinItem.VADAPAW);
		//System.out.println(tiffinItemsSet1);
		tiffinItemsSet1.add(TiffinItem.DOSA);
		System.out.println(tiffinItemsSet1);
		
		tiffinItemsSet8.add(TiffinItem.DOSA);
		System.out.println(tiffinItemsSet8);
		
		
		
	}

}
