package collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator_Far_backward {

	public static void main(String[] args) {
		
		ArrayList a1=new ArrayList(); 
		   a1.add("sita");
		  a1.add("Ram");
		   a1.add("Mansoor");
		  a1.add(14);
		  a1.add(true);
		ListIterator lt= a1.listIterator();  //In method --first letter of method should be lower case
		 while(lt.hasNext()) {
			 System.out.println(lt.next());}
		 System.out.println("______________________________________");
			 while(lt.hasPrevious()){       //should be P capital
				System.out.println(lt.previous()); // here small p
			 }
		 }

	}


