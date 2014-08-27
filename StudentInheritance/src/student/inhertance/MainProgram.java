package student.inhertance;

import java.util.ArrayList;
import java.util.List;

public class MainProgram {

	public static void main(String[] args) {
		
		
		String result;
		
		Member child = new Member("Ajay", 10);
		Member teen = new Member("Hitesh", 14);
		Member adult = new Member("Srishti", 23);
		Member awesome = new Member("cv", 23);
		
		Book vinciCode = new Book("The Vinci Code","FICTION", "Dan Brown");
		Book morrie = new Book("Tuesdays with Morrie","NONFICTION", "Mich");
		Book sher = new Book("Jungle Book","CHILDREN", "Sher Khan");
		
		DVD ts = new DVD("Truman Show", "UNIVERSAL",180);
		DVD rdb = new DVD("Rand de basanti", "YOUTH",180);
		DVD hs = new DVD("Hate Story", "ADULT",180);
		
//		List<Item> items=new ArrayList<Item>();
//		
//		items.add(vinciCode);
//		items.add(ts);
//		items.add(morrie);
//		items.add(sher);
//		items.add(rdb);
//		items.add(hs);
		
		if(vinciCode.canBeBorrowedBy(adult))
		{
			vinciCode.borrowItemBy(adult);
			adult.borrowedItem();
			result = vinciCode.toString();
			System.out.println(result);
		}
		
		
		
		
		

	}
}
