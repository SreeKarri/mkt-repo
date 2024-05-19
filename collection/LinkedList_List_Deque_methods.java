package collection;

import java.util.LinkedList;

public class LinkedList_List_Deque_methods {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add(20);
		ll.add(77);
		ll.add(980);
		ll.add(345);
		
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		
		System.out.println(ll.removeFirst());
		System.out.println(ll.removeLast());
		System.out.println(ll.pollFirst());
		System.out.println(ll.pollLast());
		ll.addFirst(99);
		System.out.println(ll);
		ll.addLast(600);
	System.out.println(ll);

	}

}
