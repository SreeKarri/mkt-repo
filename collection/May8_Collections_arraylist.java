package collection;

import java.util.ArrayList;

public class May8_Collections_arraylist {

	public static void main(String[] args) {
	   ArrayList a1=new ArrayList(); 
	   a1.add("sita");
	  a1.add("Ram");
	   a1.add("Mansoor");
	  a1.add(14);
	  a1.add(true);
	  //a1.remove(14);even though trying to remove object but it taking as index position
	 a1.remove(0);
	  
	 System.out.println(a1.contains("sam"));
	 
	 System.out.println (a1.isEmpty())	;
	   
	   //a1.clear();
	  
	   System.out.println(a1);
	   ArrayList a2=new ArrayList();
	   a2.addAll(a1);
	   a2.add(2, "Kanthi");
	   a2.addAll(4, a1);
	   a2.add(14);
	  a2.removeAll(a1);
	 System.out.println  (a2.containsAll(a1));
	    
	   System.out.println(a2);
	   ArrayList a3=new ArrayList();
	   a3=(ArrayList)a2.clone();
	   System.out.println(a3);  //(a3 is made just replica of a2)

	}

}
