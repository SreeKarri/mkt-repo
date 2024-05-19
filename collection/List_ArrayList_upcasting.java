package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class List_ArrayList_upcasting {

	public static void main(String[] args) {
	List l=new ArrayList();
	l.add("Nature");
	l.add(1, "Sun");
	l.add("Moon");
	l.add(3, "Moon");
	l.add("Moon");
	l.add(null);
	l.add(null);
	l.add(null);
	l.add(65);
	l.add(true);
	l.add(0.0);
	
	System.out.println(l);
	
	Set s=new TreeSet();
	s.add("Nature");
	s.add("Sun");
	s.add("Moon");
	s.add("Moon");
	s.add("Moon");
	s.add(10);
	s.add(false);
	s.add(20.2);
	//s.add(null);
	//s.add(null);
	System.out.println(s);
	
	/*
	 *  
	Set<Integer> intSet = new HashSet<>() {{
    add(4);
    add(7);
    add(12);
}};
	 */
	
	
	
	
	
	
	
	}

}
