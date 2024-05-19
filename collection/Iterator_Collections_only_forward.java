package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_Collections_only_forward {

	public static void main(String[] args) {
		 ArrayList a1=new ArrayList(); 
		   a1.add("sita");
		  a1.add("Ram");
		   a1.add("Mansoor");
		  a1.add(14);
		  a1.add(true);
		  Iterator i=a1.iterator();
		  while (i.hasNext()) {  //it travels forward direction only
			  System.out.println(i.next());
		  }

	}

}
