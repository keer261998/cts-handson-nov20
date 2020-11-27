package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AscendingDescendingComparator {
	
	public static void main(String[] args) {
		
		List<Items> list= new ArrayList<Items>();
		list.add(new Items(200,"Tv",56000));
		list.add(new Items(100,"Ac",65000));
		list.add(new Items(300,"Fridge",45000));
		
		System.out.println("--Sorting in ascending using comparator method--");
		Comparator<Items> sortById= new Comparator<Items>() {
		public int compare(Items i1, Items i2) {
			return i1.getId()-i2.getId();
		}
		
	};
	Collections.sort(list, sortById);
	for(Items item:list) System.out.println(item);
	
	System.out.println("--Sorting in descending using comparator method--");
	Comparator<Items> sortById1= new Comparator<Items>() {
	public int compare(Items i1, Items i2) {
		return i2.getId()-i1.getId();
	}
	
};
Collections.sort(list, sortById1);
for(Items item:list) System.out.println(item);

}

	
	}
	
	


