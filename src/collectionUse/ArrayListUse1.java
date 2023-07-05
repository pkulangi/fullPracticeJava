 package collectionUse;

import java.util.ArrayList;

public class ArrayListUse1 {

	public static void main(String[] args)
	{
		ArrayList<Object>al=new ArrayList<>();
		System.out.println(al);
		
		al.add("Hi");
		al.add('M');
		al.add(2);
		al.add("Prasad");
		al.add(null);
		al.add(true);
		al.add(null);
		al.add(9);
		al.add(12.22f);
		al.add("Mom");
		al.add(12.223);
		
		System.out.println(al);
		
		al.add(1,"Hello");
		System.out.println(al);
		
		//al.clear();
		//System.out.println(al);
		
		Object al1 = al.clone();//its use for copy
		//System.out.println(al1);
		
		System.out.println(al.contains("Mom"));
		
		System.out.println(al.contains('F'));
		
		System.out.println(al.equals(al1));
		
		System.out.println(al.get(2));
		
		System.out.println(al.get(8));
		
		System.out.println(al.lastIndexOf("Mom"));
		
		System.out.println(al.isEmpty());
		
		System.out.println(al.lastIndexOf(12.223));
		
		System.out.println(al.lastIndexOf("Hello"));
		
		System.out.println(al.remove(5));
		
		System.out.println(al.remove(12.22f));
		
		System.out.println(al.set(2, 50));
		
		System.out.println(al);
		
		System.out.println(al.size());
		
		//for each loop
		
		for(Object p:al)
		{
			System.out.println(p);
		}
		
		
	}

}
