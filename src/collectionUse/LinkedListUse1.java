package collectionUse;

import java.util.LinkedList;

public class LinkedListUse1 {

	public static void main(String[] args)
	{
		LinkedList<String>ll=new LinkedList<>();
		
		ll.add("Pune");
		ll.add("Karad");
		ll.add("Thane");
		ll.add("Kolhapur");
		
		System.out.println(ll);
		
		ll.add("Mumbai");
		System.out.println(ll);
		
		System.out.println(ll.contains("Pune"));
		
		System.out.println(ll.element());
		
		System.out.println(ll.get(2));
		
		System.out.println(ll.getFirst());
		
		System.out.println(ll.getLast());
		
		System.out.println(ll.indexOf("Thane"));
		
		System.out.println(ll.peek());
		
		System.out.println(ll.peekLast());
		
		System.out.println(ll.poll());
		
		System.out.println(ll.pollFirst());
		
		System.out.println(ll.pollLast());
		
		System.out.println(ll.remove(0));
		
	  
	    
	    System.out.println(ll.size());
	    
	    
	    
	    System.out.println("==================for each loop==================================");
	    
	    for(String l:ll)
	    {
	    	System.out.println(l);
	    }

	}

}
