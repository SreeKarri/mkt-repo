package collection;

import java.util.LinkedList;

public class LinkedListClass {

	public static void main(String[] args) {
		LinkedList<Integer>l1=new LinkedList();
		l1.add(12);
		l1.add(21);
		l1.add(321); 
		l1.add(22);
		System.out.println("1 "+l1.getFirst());//getting first object
		System.out.println("2 "+l1.getLast());//getting last object
		System.out.println("3 "+l1.peekFirst());//same as getFirst
		System.out.println("4 "+l1.peekLast());//same as get last
	l1.addFirst(9); //add this element on top of your array
		System.out.println("5 "+l1);
		l1.addLast(222);//add this object on last of your array
		System.out.println("6 "+l1);
		System.out.println("7 "+l1.offer(999));
		System.out.println("8 "+l1.offerFirst(6754));//same as add first
		System.out.println("9 "+l1.offerLast(65439));//same as add last
		System.out.println("10 "+"poll First "+l1.pollFirst());//same as remove first
		System.out.println("11 "+"Poll Last "+l1.pollLast());//same as removeLast()	;
		System.out.println("12 "+l1.removeFirst());
		System.out.println("13 "+l1);

	}

}
